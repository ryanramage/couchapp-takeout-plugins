/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.couchapptakeout.events.utils;

import java.net.URL;
import javax.swing.JOptionPane;

/**
 *
 * @author ryan
 */
public class Desktop {

    public static void showUrl(URL dest) {


        java.awt.Desktop desktop = null;
        if (java.awt.Desktop.isDesktopSupported()) {
            desktop = java.awt.Desktop.getDesktop();
            try {
                desktop.browse(dest.toURI());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                "Exception: " + ex.getMessage());
            }
        }

    }
    
}
