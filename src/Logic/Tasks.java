package Logic;

import Frames.*;
import java.awt.Desktop;
import java.awt.Frame;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tasks {

    public Tasks() {
        start();
    }

    private void start() {
        if (Memory.openTestRoom) {
            showTestRoomFrame();
        } else {
            showHomeFrame();
        }
    }

    public static void showHomeFrame() {
        Home home = new Home();
        home.setVisible(true);
    }

    public static void showAboutFrame() {
        About about = new About();
        about.setVisible(true);
    }

    public static void showTestRoomFrame() {
        TestRoom testRoom = new TestRoom();
        testRoom.setVisible(true);
    }

    /**
     * Shows JOptionPane panel.
     *
     * @param message Body message.
     * @param title Title message.
     * @param icon Type of icon to show. Options: "Error", "Message", "Alert",
     * "QuestionMark"
     */
    public static void joptionPaneMessage(String message, String title, String icon) {
        switch (icon) {
            case "Error":
                JOptionPane.showMessageDialog(null, message, title, 0);
                break;
            case "Message":
                JOptionPane.showMessageDialog(null, message, title, 1);
                break;
            case "Alert":
                JOptionPane.showMessageDialog(null, message, title, 2);
                break;
            case "QuestionMark":
                JOptionPane.showMessageDialog(null, message, title, 3);
                break;
            default:
                JOptionPane.showMessageDialog(null, message, title, 1);
        }
    }

    /**
     * Shows a JOptionPane that asks the user something.
     *
     * @param message Body message.
     * @param title Title message.
     * @param option Shows answer buttons. 0: Yes & No buttons. Yes returns 0.
     * No returns 1. X returns -1. 1: Yes, No & Cancel buttons. Yes returns 0.
     * No returns 1, Cancel returns 2. X returns -1. 2: Accept & Cancel buttons.
     * Accept returns 0. Cancel returns 2. X returns -1.
     * @param icon Shows an icon. "Error": shows error icon. "Message": shows
     * informative icon. "Alert": shows exclamation icon. "QuestionMark": shows
     * question mark icon.
     * @return int - Returns the number of the specified button pressed. Read
     * option @param description.
     */
    public static int joptionPaneAsk(String message, String title, int option, String icon) {
        switch (icon) {
            case "Error":
                return JOptionPane.showConfirmDialog(null, message, title, option, 0);
            case "Message":
                return JOptionPane.showConfirmDialog(null, message, title, option, 1);
            case "Alert":
                return JOptionPane.showConfirmDialog(null, message, title, option, 2);
            case "QuestionMark":
                return JOptionPane.showConfirmDialog(null, message, title, option, 3);
            default:
                return JOptionPane.showConfirmDialog(null, message, title, option, 1);
        }
    }

    /**
     * Copies input text into user's clipboard.
     *
     * @param input Text to copy into clipboard.
     */
    public static void copyToClipBoard(String input) {
        StringSelection selection = new StringSelection(input);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }

    /**
     * Opens an URL on user's browser.
     *
     * @param link URL link to open on the browser.
     */
    public static void openLink(String link) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(link));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
