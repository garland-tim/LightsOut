/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

/**
 *
 * @author Clinton
 */
public class MainMenuControl {
    public void quitGame(){
        
    }
    
    public void newGame(){
        
    }
    
    public void showMoves(){
        
    }
    
    public void displayMenu(){
        
    }
    
    public void displayHelp(){
        HelpMenuView myHelpMenu = new HelpMenuView();
        int theReturn;
        do {
            myHelpMenu.display();
            theReturn = myHelpMenu.getInput();
           }
        while (theReturn != 1);
    }
    
    public void errorMessage(){
    }
}
