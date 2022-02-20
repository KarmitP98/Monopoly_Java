/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolyalpha;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Harsh
 */
public class SplashScreen {

    public static void makeSplash() {
        JDialog logoDialog = new JDialog();
        JLabel imageLabel = new JLabel(new ImageIcon("Karsheel Labs.png"));
        logoDialog.add(imageLabel);
        logoDialog.setSize(imageLabel.getWidth(), imageLabel.getHeight());
        logoDialog.setUndecorated(true);
        logoDialog.getRootPane().setOpaque(false);
        logoDialog.getContentPane().setBackground(new Color(0, 0, 0, 0));
        logoDialog.setBackground(new Color(0, 0, 0, 0));
        logoDialog.pack();
        logoDialog.setLocationRelativeTo(null);
        logoDialog.setVisible(true);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logoDialog.setVisible(false);

        JDialog gifDialog = new JDialog();
        JLabel splash = new JLabel(new ImageIcon("Splash-Gif.gif"));
        gifDialog.add(splash);
        gifDialog.setSize(splash.getWidth(), splash.getHeight());
        gifDialog.setUndecorated(true);
        gifDialog.getRootPane().setOpaque(false);
        gifDialog.getContentPane().setBackground(new Color(0, 0, 0, 0));
        gifDialog.setBackground(new Color(0, 0, 0, 0));
        gifDialog.pack();
        gifDialog.setLocationRelativeTo(null);
        gifDialog.setVisible(true);

        try {
            Thread.sleep(4500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gifDialog.setVisible(false);
    }

    public static void main(String[] args) {
        makeSplash();
    }
}
