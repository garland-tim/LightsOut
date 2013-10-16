/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

/**
 *
 * @author Clinton
 */
public class HelpMenuControl {
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
}
