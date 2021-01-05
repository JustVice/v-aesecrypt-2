package Objects;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Aes {

    private static SecretKeySpec secretKey;
    private static byte[] key;

    /**
     * Encrypts given plaintext message.
     *
     * @param plaintext Input text to encrypt.
     * @param secret Input password key to encrypt.
     * @return String - Result of ecryption. Null if there is an error.
     */
    public static String encrypt(String plaintext, String secret) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(plaintext.getBytes("UTF-8")));
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    /**
     * Decrypts given plaintext.
     *
     * @param plaintext Input text to decrypt.
     * @param secret Password key to decrypt plaintext.
     * @return String - Decrypted plaintext given. Exeption if there is an
     * error.
     */
    public static String decrypt(String plaintext, String secret) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(plaintext)));
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    /**
     * Checks whether the password key is correct or AES text given.
     *
     * @param input output of decrypt function.
     * @return Boolean - true if password key is correct or AES text given.
     */
    public static boolean decryptionSuccess(String input) {
        return input != null;
    }

    // Method to create secret key.
    public static void setKey(String myKey) {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, "AES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
