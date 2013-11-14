/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

import java.util.Scanner;
/**
 *
 * @author Clinton
 */


public class MainMenuView {
    private final static String[][] menuItems = {
    {"S", "See array sort"},
    {"T", "Tim's Lesson 6"},
    {"G", "Goodman's Lesson 6"},
    {"C", "Change Light"},
    {"Q", "Quit the Game"},
    {"N", "New Game"},
    {"L", "Show number of Lights left"},
    {"M", "Display Menu"},
    {"B", "Display Board"},
    {"H", "Help"}
};
    
    MainMenuControl myMainControl = new MainMenuControl();
    
    public MainMenuView(){
        this.displayMainMenu();
        myMainControl.newGame();
        myMainControl.displayBoard();
        int theReturn;
        do {
            theReturn = this.runMenu();
           }
        while (theReturn != 1);
    }
    
    public int runMenu(){
        int myReturn = 0;
            AskInput myAsk = new AskInput();
            String mainMenuInput = myAsk.askMenuInput();
            switch (mainMenuInput) {
                case "Q":
                    this.myMainControl.quitGame();
                    myReturn = 1;
                    break;
                case "N":
                    this.myMainControl.newGame();
                    myMainControl.displayBoard();
                    break;
                case "M":
                    this.displayMainMenu();
                    break;
                case "B":
                    myMainControl.displayBoard();
                    break;
                case "L":
                    this.myMainControl.showLightsOn();
                    break;
                case "T":
                    this.myMainControl.Tim();
                    break;
                case "G":
                    this.myMainControl.Goodman();
                    break;
                case "C":
                    this.myMainControl.changeLight();
                    myMainControl.displayBoard();
                    break;
                case "S":
                    this.myMainControl.arraySample();
                    break;
                case "H":
                    this.myMainControl.displayHelp();
                    this.displayMainMenu();
                    myMainControl.displayBoard();
                    break;
                default:
                    this.myMainControl.errorMessage();
                    myReturn = -1;
            }
            return myReturn;
    }
    
    public void displayMainMenu()
    {
        System.out.println("=============== Main Menu ===============");
        for(int i = 0; i < MainMenuView.menuItems.length; i++)
        {
            System.out.println("\t" + this.menuItems[i][0] + "\t" + this.menuItems[i][1]);
        }
        System.out.println("=========================================");
    }
}
