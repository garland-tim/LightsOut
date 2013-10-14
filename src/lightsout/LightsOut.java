/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

import java.util.Scanner;

/**
 *
 * @author Clint and Tim
 */
public class LightsOut {

    String name;
    String instructions = "Goal of the game: Turn off all the lights on the board!  Click on a space, and that space as well as the spaces above, to the left, right, and bottom of it will be inversed.  Continue to inverse the lights until all lights are turned off.";
    public static void main(String[] args) {
        // TODO code application logic here
        LightsOut myGame = new LightsOut();
        myGame.getName();
        myGame.displayHelp();
        
        //For funsies
        Player myPlayer = new Player();
        Board myBoard = new Board();
        Light myLight = new Light();
        
        AskInput myInput = new AskInput();
        
        HelpMenuView myHelpMenu = new HelpMenuView();
        myHelpMenu.display();
    }
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
}

