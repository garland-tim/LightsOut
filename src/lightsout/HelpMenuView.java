/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

import java.io.Serializable;
import java.util.Scanner;
/**
 *
 * @author Clinton
 */


public class HelpMenuView implements Serializable {
    
    private final static String[][] menuItems = {
    {"L", "The Light"},
    {"B", "The Board"},
    {"R", "The Rules"},
    {"P", "The Player"},
    {"Q", "Quit Help"}
};

    public HelpMenuView() {
    }

    public HelpMenuControl getMyMenuControl() {
        return myMenuControl;
    }

    public void setMyMenuControl(HelpMenuControl myMenuControl) {
        this.myMenuControl = myMenuControl;
    }

    public AskInput getMyAsk() {
        return myAsk;
    }

    public void setMyAsk(AskInput myAsk) {
        this.myAsk = myAsk;
    }
    
    
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
    public class HelpMenuControl implements Serializable {

    public HelpMenuControl() {
    }
    
    public void displayLightHelp(){
        System.out.println("The filled in locations are the on lights, while the empty locations are the \n"
                + "off lights. Once the board is empty all lights are off.");
    }
    
    public void displayBoardHelp(){
        System.out.println("The board is set up with letters for the column and numbers for the rows. \n"
                + "The input when selecting a location to change the light should be done cloumn and \n"
                + "then row. For example A2.");
    }
    
    public void displayPlayerHelp(){
        System.out.println("The player is you. Your goal is to have all of the lights on the board set to \n"
                + "off in order to complete the puzzle. To see which lights are on and off please refer to \n"
                + "the light help in the help menu.");
    }
    
    public void displayRulesHelp(){
        System.out.println("Only one light may be selected at a time. Once the light has been selected \n"
                + "it will turn the light you selected either on or off and the corresponding verticaly \n"
                + "and horizontaly adjacent lights will also be switched. Once all of the lights have \n"
                + "been set to off you have completed the puzzle.");
    }
    
    public void errorMessage(){
        System.out.println("That is not a valid menu option. Please enter a vaild menu option.");
    }
}
    
}
