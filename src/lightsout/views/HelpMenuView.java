/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.views;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;
import lightsout.controls.AskInput;
import lightsout.Board;
import lightsout.Goodbye;
import lightsout.SayHello2;
import lightsout.Status;
/**
 *
 * @author Clinton
 */


public class HelpMenuView extends Menu implements Serializable  {
    
    private static final String[][] menuItems = {
    {"L", "The Light"},
    {"B", "The Board"},
    {"R", "The Rules"},
    {"P", "The Player"},
    {"Q", "Quit Help"}
};

    public HelpMenuView() {
        super(HelpMenuView.menuItems);
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
    @Override
    public Status processMenuInput(){
        Status myReturn;
        String helpInput = myAsk.askMenuInput();
            switch (helpInput) {
                case "L":
                    this.myMenuControl.displayLightHelp();
                    myReturn = Status.CONTINUE;
                    break;
                case "B":
                    this.myMenuControl.displayBoardHelp();
                    myReturn = Status.CONTINUE;
                    break;
                case "R":
                    this.myMenuControl.displayRulesHelp();
                    myReturn = Status.CONTINUE;
                    break;
                case "P":
                    this.myMenuControl.displayPlayerHelp();
                    myReturn = Status.CONTINUE;
                    break;
                case "Q":
                    myReturn = Status.RETURN;
                    break;
                default:
                    this.myMenuControl.errorMessage();
                    myReturn = Status.ERROR;
            }
            return myReturn;
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

    @Override
    public String toString() {
        return "HelpMenuView{" + "myMenuControl=" + myMenuControl + ", myAsk=" + myAsk + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.myMenuControl);
        hash = 37 * hash + Objects.hashCode(this.myAsk);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HelpMenuView other = (HelpMenuView) obj;
        if (!Objects.equals(this.myMenuControl, other.myMenuControl)) {
            return false;
        }
        if (!Objects.equals(this.myAsk, other.myAsk)) {
            return false;
        }
        return true;
    }
    
}
