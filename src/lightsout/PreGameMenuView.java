/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

import java.util.Scanner;
/**
 *
 * @author Tim
 */


public class PreGameMenuView {
    
    private final static String[][] menuItems = {
    {"N", "New Game"},
    {"H", "How to Play"},
    {"Q", "Quit"}
};
    
    PreGameMenuControl myMainControl = new PreGameMenuControl();
    
    public PreGameMenuView(){
        this.display();
        this.getInput();
    }
    
    public int getInput(){
        int myReturn = 0;
        String helpInput;
            Scanner input = new Scanner(System.in);
            helpInput = input.next();
            helpInput = helpInput.toUpperCase();
            switch (helpInput) {
                case "N":
                    MainMenuView myMainMenu = new MainMenuView();
                    break;
                case "H":
                    this.myMainControl.displayHowTo();
                    this.getInput();
                    break;
                case "Q":
                    myReturn = 1;
                    break;
                default:
                    this.myMainControl.errorMessage();
                    this.getInput();
                    myReturn = -1;
            }
            return myReturn;
    }
    
    public void display()
    {
        System.out.println("============= PreGame Menu =============");
        System.out.println("Please enter the letter for your choice: ");
        for(int i = 0; i < PreGameMenuView.menuItems.length; i++)
        {
            System.out.println("\t" + PreGameMenuView.menuItems[i][0] + "\t" + PreGameMenuView.menuItems[i][1]);
        }
        System.out.println("=========================================");
    }
}
