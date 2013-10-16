/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

/**
 *
 * @author Clinton
 */
public class PreGameMenuControl {
    public void displayLightHelp(){
        System.out.println("This is the light help");
    }
    
    public void displayBoardHelp(){
        System.out.println("This is the board help");
    }
    
    public void displayPlayerHelp(){
        System.out.println("This is the player help");
    }
    
    public void displayRulesHelp(){
        System.out.println("This is the rule help");
    }
    
    public void errorMessage(){
        System.out.println("That is not a valid command.\nPlease try again.");
    }
}
