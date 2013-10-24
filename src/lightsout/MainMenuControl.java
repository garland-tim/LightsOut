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
    Board myBoard;
    public void quitGame(){
        System.out.println("Thanks for playing!");
    }
    
    public MainMenuControl(){
    }
    
    public void changeLight(){
        AskInputLight myAsk = new AskInputLight(this.myBoard);
    }
    
    public void newGame(){
        Board myBoard = new Board();
        myBoard.displayBoard();
    }
    
    public void showMoves(){
        System.out.println("Show Moves function not created quite yet...");
    }
    
    public void displayMenu(){
        System.out.println("This display menu should be functional soon... function not created quite yet...");
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
        System.out.println("Somethings fishy here....");
    }
}
