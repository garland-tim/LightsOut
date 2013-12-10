/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.views;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;
import lightsout.models.AskInput;
import lightsout.models.Board;
import lightsout.controls.Goodbye;
import lightsout.controls.MainMenuControl;
import lightsout.controls.SayHello2;
import lightsout.enums.Status;
import lightsout.exceptions.BoardException2;
import lightsout.exceptions.MenuException;
/**
 *
 * @author Clinton
 */


public class MainMenuView extends Menu implements Serializable, lightsout.interfaces.ErrorInfo {
    private final static String[][] menuItems = {
    {"S", "See array sort"},
    {"T", "Tim's Lesson 6"},
    {"G", "Goodman's Lesson 6"},
    {"P", "Goodman's Lesson 9 (Super Class)"},
    {"C", "Change Light"},
    {"Q", "Quit the Game"},
    {"N", "New Game"},
    {"L", "Show number of Lights left"},
    {"M", "Display Menu"},
    {"B", "Display Board"},
    {"H", "Help"}
};
    
    MainMenuControl myMainControl = new MainMenuControl();
    
    public MainMenuView(){
        super(MainMenuView.menuItems);
        this.displayMenu();
        myMainControl.newGame();
        myMainControl.displayBoard();
        Status menuReturn;
        do {
            try{
                menuReturn = this.processMenuInput();
            }
            catch(MenuException me){
                errormsg("Invalid menu input.\nPlease try again.");
                menuReturn = Status.ERROR;
            }
           }
        while (menuReturn == Status.IN_PROGRESS || menuReturn == Status.ERROR);
    }

    public MainMenuControl getMyMainControl() {
        return myMainControl;
    }

    public void setMyMainControl(MainMenuControl myMainControl) {
        this.myMainControl = myMainControl;
    }
    
    @Override
    public void errormsg(String message){
        System.out.println(message);
    }
    
    @Override
    public Status processMenuInput() throws MenuException{
        Status myReturn;
            String mainMenuInput = this.getInput();
            switch (mainMenuInput) {
                case "Q":
                    myReturn = this.myMainControl.quitGame();
                    break;
                case "N":
                    myReturn = this.myMainControl.newGame();
                    myMainControl.displayBoard();
                    break;
                case "M":
                    myReturn = this.displayMenu();
                    break;
                case "B":
                    myReturn = myMainControl.displayBoard();
                    break;
                case "L":
                    myReturn = this.myMainControl.showLightsOn();
                    break;
                case "C":
                    myReturn = this.myMainControl.changeLight();
                    myMainControl.displayBoard();
                    break;
                case "H":
                    myReturn = this.myMainControl.displayHelp();
                    this.displayMenu();
                    myMainControl.displayBoard();
                    break;
                default:
                    myReturn = Status.ERROR;
                    throw new MenuException();
            }
            return myReturn;
    }
    

}
