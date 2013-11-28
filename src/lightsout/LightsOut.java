/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

import lightsout.controls.Player;
import lightsout.views.MainMenuView;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Clint and Tim
 */
public class LightsOut {
    public static void main(String[] args) {
        System.out.println("Goal of the game: Turn off all the lights on the board!\nClick on a space, and that space as well as the spaces above, \nto the left, right, and bottom of it will be inversed.\nContinue to inverse the lights until all lights\nare turned off.\n\n");
        
        //Create a new player
        Player myPlayer = new Player();
        myPlayer.askName();
        myPlayer.printName();
        
        MainMenuView myMainMenu = new MainMenuView();      
    }
}

