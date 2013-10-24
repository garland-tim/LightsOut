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
    String instructions = "Goal of the game: Turn off all the lights on the board!\nClick on a space, and that space as well as the spaces above, \nto the left, right, and bottom of it will be inversed.\nContinue to inverse the lights until all lights\nare turned off.\n\n";
    public static void main(String[] args) {
        // TODO code application logic here
        LightsOut myGame = new LightsOut();
        myGame.getName();
        myGame.displayHelp();
        
        //Create a new player
        Player myPlayer = new Player();
        
        MainMenuView myMainMenu = new MainMenuView();      
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

