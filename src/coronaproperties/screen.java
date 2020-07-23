/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronaproperties;

import java.awt.Color;

/**
 *
 * @author MightyBeatz
 */
public class screen {
    static Splash spl = new Splash();
    screen() {
        splash();
    }

    public static void splash() {
        spl.setTitle("Corona Properties");
        spl.setOpacity((float) 0.9);
        spl.setBackground(new Color(0, 0, 0, 0));
        spl.setLocationRelativeTo(null);
        spl.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);
                spl.lblHouse.setText(Integer.toString(i) + "%");
                spl.bar.setValue(i);

                if (i == 100) {
                    spl.dispose();
                    Login loginScreen = new Login();

                    loginScreen.setTitle("Login");
                    loginScreen.setOpacity((float) 0.9);
//                    loginScreen.setBackground(new Color(0, 0, 0, 0));
                    loginScreen.setLocationRelativeTo(null);
                    loginScreen.setVisible(true);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
