package coronaproperties;

import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author Melvin K
 */
public class Driver {
    public static void main(String[] args) {
//        LoadingScreen sc = new LoadingScreen();

//Open menu
        MainMenu menu = new MainMenu();

        menu.setTitle("Corona Main Menu");
        menu.setOpacity((float) 0.9);
        menu.setBackground(new Color(0, 0, 0, 0));
        menu.setIconImage(Toolkit.getDefaultToolkit().
                getImage(SetJFrame_Icon.class.getResource("/icons/icons8_House_100px.png")));
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        ReadPropByMenu aReadPropByMenu = new ReadPropByMenu();
//
//        aReadPropByMenu.setTitle("Corona View By Menu");
//        aReadPropByMenu.setOpacity((float) 0.9);
//        aReadPropByMenu.setBackground(new Color(0, 0, 0, 0));
//        aReadPropByMenu.setIconImage(Toolkit.getDefaultToolkit().
//                getImage(SetJFrame_Icon.class.getResource("/icons/icons8_House_100px.png")));
//        aReadPropByMenu.setLocationRelativeTo(null);
//        aReadPropByMenu.setVisible(true);
    }

}
