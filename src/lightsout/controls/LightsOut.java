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
            System.out.println("Goal of the game: Turn off all the lights on the board!\nClick on a space, and that space as well as the spaces above, \nto the left, right, and bottom of it will be inversed.\nContinue to inverse the lights until all lights\nare turned off.\n\n");
                        
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

