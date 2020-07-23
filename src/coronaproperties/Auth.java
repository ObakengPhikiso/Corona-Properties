package coronaproperties;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Melvin K
 */
public class Auth {
    private static class Authentication {
        //fields
        private String emailString;
        private String passString;
    }
    private static Authentication authentic;
    Auth(String emailString, String passString) {
        getData();

        if (authenticate(emailString, passString)) {

            closeLoginScreen();
            openMenu();
        } else {
            Login loginScreen = new Login();

            loginScreen.setTitle("Login");
            loginScreen.setOpacity((float) 0.9);
            loginScreen.setBackground(new Color(0, 0, 0, 0));
            loginScreen.setIconImage(Toolkit.getDefaultToolkit().
                    getImage(SetJFrame_Icon.class.getResource("/icons/icons8_House_100px.png")));
            loginScreen.setLocationRelativeTo(null);
            loginScreen.setVisible(true);

            JOptionPane.showMessageDialog(null, "Email or Password is incorrect!");
        }
    }

    private static void getData() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/home/***REMOVED***/auth.txt"));
            String rec = reader.readLine();
            String remain = "";

            while (rec != null) {
                authentic = new Authentication();

                authentic.emailString = rec.substring(0, rec.indexOf("#"));
                remain = rec.substring(rec.indexOf("#") + 1, rec.length());

                authentic.passString = remain;

                rec = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean authenticate(String emailString, String passString) {
        boolean correct = false;

        if (emailString.compareTo(authentic.emailString) == 0 && passString.compareTo(authentic.passString) == 0) {
            correct = true;
        }
        return correct;
    }

    private static void closeLoginScreen() {
        //Close Login screen
        Login loginScreen = new Login();
        loginScreen.setVisible(false);
        loginScreen.dispose();
        System.gc();
    }

    private static void openMenu() {
        //Open menu
        Menu menu = new Menu();

        menu.setTitle("Corona Menu");
        menu.setOpacity((float) 0.9);
        menu.setBackground(new Color(0, 0, 0, 0));
        menu.setIconImage(Toolkit.getDefaultToolkit().
                getImage(SetJFrame_Icon.class.getResource("/icons/icons8_House_100px.png")));
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }

}
