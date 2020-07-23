/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronaproperties;

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
        spl.setVisible(true);
         try{
            for(int i =0;i <=100;i++)
            {
                Thread.sleep(50);
                spl.lblHouse.setText(Integer.toString(i)+"%");
                spl.bar.setValue(i);
                
                if(i==100)
                {
                    spl.dispose();
                    new Login().setVisible(true);
                }
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }   
}
