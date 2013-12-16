/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.controls;

import java.io.Serializable;

/**
 *
 * @author Clinton
 */
    public class HelpMenuControl implements Serializable {

    public HelpMenuControl() {
    }
    
    public String displayLightHelp(){
        return "The filled in locations are the on lights, while the empty locations are the off lights. Once the board is empty all lights are off.";
    }
    
    public String displayBoardHelp(){
        return "The board is set up with letters for the column and numbers for the rows. The input when selecting a location to change the light should be done cloumn and then row. For example A2.";
    }
    
    public String displayPlayerHelp(){
        return "The player is you. Your goal is to have all of the lights on the board set to off in order to complete the puzzle. To see which lights are on and off please refer to the light help in the help menu.";
    }
    
    public String displayRulesHelp(){
        return "Only one light may be selected at a time. Once the light has been selected it will turn the light you selected either on or off and the corresponding verticaly and horizontaly adjacent lights will also be switched. Once all of the lights have been set to off you have completed the puzzle.";
    }
    
    public String errorMessage(){
        return "That is not a valid menu option. Please enter a vaild menu option.";
    }
}