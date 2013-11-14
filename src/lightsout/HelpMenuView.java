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


public class HelpMenuView {
    
    private final static String[][] menuItems = {
    {"L", "The Light"},
    {"B", "The Board"},
    {"R", "The Rules"},
    {"P", "The Player"},
    {"Q", "Quit Help"}
};
    
    HelpMenuControl myMenuControl = new HelpMenuControl();
    AskInput myAsk = new AskInput();
    public int processMenuInput(){
        int myReturn = 0;
        String helpInput = myAsk.askMenuInput();
            switch (helpInput) {
                case "L":
                    this.myMenuControl.displayLightHelp();
                    break;
                case "B":
                    this.myMenuControl.displayBoardHelp();
                    break;
                case "R":
                    this.myMenuControl.displayRulesHelp();
                    break;
                case "P":
                    this.myMenuControl.displayPlayerHelp();
                    break;
                case "Q":
                    myReturn = 1;
                    break;
                default:
                    this.myMenuControl.errorMessage();
                    myReturn = -1;
            }
            return myReturn;
    }
    
    public void displayHelpMenu()
    {
        System.out.println("=============== Help Menu ===============");
        System.out.println("Please enter the letter for your choice: ");
        for(int i = 0; i < HelpMenuView.menuItems.length; i++)
        {
            System.out.println("\t" + this.menuItems[i][0] + "\t" + this.menuItems[i][1]);
        }
        System.out.println("=========================================");
    }
}
