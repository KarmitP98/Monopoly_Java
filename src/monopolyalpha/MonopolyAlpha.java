/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolyalpha;

import monopolyalpha.forms.Dashboard;

/**
 *
 * @author Harsh
 */
public class MonopolyAlpha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SplashScreen splash = new SplashScreen();
        splash.makeSplash();
//       MusicPlayer.play();        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });

    }

}
