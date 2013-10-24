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
    {"C", "Change Light"},
    {"Q", "Quit the Game"},
    {"N", "New Game"},
    {"M", "Show number of moves"},
    {"D", "Display this menu"},
    {"H", "Help"}
};
    MainMenuControl myMainControl = new MainMenuControl();
    
    public MainMenuView(){
        this.display();
        int theReturn;
        do {
            theReturn = this.getInput();
           }
        while (theReturn != 1);
    }
    
    public int getInput(){
        int myReturn = 0;
        String mainInput;
            Scanner input = new Scanner(System.in);
            mainInput = input.next();
            mainInput = mainInput.toUpperCase();
            switch (mainInput) {
                case "Q":
                    this.myMainControl.quitGame();
                    myReturn = 1;
                    break;
                case "N":
                    this.myMainControl.newGame();
                    break;
                case "M":
                    this.myMainControl.showMoves();
                    break;
                case "D":
                    this.myMainControl.displayMenu();
                    break;
                case "C":
                    this.myMainControl.changeLight();
                    break;
                case "H":
                    this.myMainControl.displayHelp();
                    this.display();
                    break;
                default:
                    this.myMainControl.errorMessage();
                    myReturn = -1;
            }
            return myReturn;
    }
    
    public void display()
    {
        System.out.println("=============== Main Menu ===============");
        for(int i = 0; i < MainMenuView.menuItems.length; i++)
        {
            System.out.println("\t" + MainMenuView.menuItems[i][0] + "\t" + MainMenuView.menuItems[i][1]);
        }
        System.out.println("=========================================");
    }
}
