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
    
    public String getInput(){
        String helpInput;
            Scanner input = new Scanner(System.in);
            helpInput = input.next();
            switch (helpInput) {
                case "L":
                    this.myMenuControl.displayLightHelp();
                    break;
                case "B":
                    this.myMenuControl.displayLightHelp();
                    break;
                case "R":
                    this.myMenuControl.displayLightHelp();
                    break;
                case "P":
                    this.myMenuControl.displayLightHelp();
                    break;
                case "Q":
                    return "QUIT";
            }
            return "QUIT!";
    }
    
    public void display()
    {
        System.out.println("=============== Help Menu ===============");
        System.out.println("Please enter the letter for your choice: ");
        for(int i = 0; i < HelpMenuView.menuItems.length; i++)
        {
            System.out.println("\t" + HelpMenuView.menuItems[i][0] + "\t" + HelpMenuView.menuItems[i][1]);
        }
        System.out.println("=================================");
    }
}
