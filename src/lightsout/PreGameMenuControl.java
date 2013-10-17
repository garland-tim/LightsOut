/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

/**
 *
 * @author Tim
 */
public class PreGameMenuControl {
    public void displayHowTo(){
        System.out.println("Only one light may be selected at a time. Once the light has been selected \n"
                + "it will turn the light you selected either on or off and the corresponding verticaly \n"
                + "and horizontaly adjacent lights will also be switched. Once all of the lights have \n"
                + "been set to off you have completed the puzzle.");
    }
    public void errorMessage(){
        System.out.println("That is not a valid command.\nPlease try again.");
    }
}
