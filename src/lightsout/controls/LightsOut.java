/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.controls;

import lightsout.models.Player;
import java.util.Random;
import java.util.Scanner;
import lightsout.frames.GetNamesFrame;
import lightsout.frames.MainFrame;

/**
 *
 * @author Clint and Tim
 */
public class LightsOut {
    public static MainFrame mainFrame = null;
    
    public static void main(String[] args) {
        try{              
                          /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    LightsOut.mainFrame = new MainFrame();
                    LightsOut.mainFrame.setVisible(true);
                }
            });
        }
        catch(Throwable ex){
            System.out.println("There was an unexpected error in the game.\nProgram will now close.");
            System.out.println(ex.getStackTrace());
        }
        finally{
            if (LightsOut.mainFrame != null) {
                LightsOut.mainFrame.dispose();
            }
        }
    }
}

