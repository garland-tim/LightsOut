/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.controls;

import java.io.Serializable;
import java.util.Objects;
import javax.swing.JTable;
import lightsout.enums.LightSwitch;
import lightsout.enums.Status;
import lightsout.exceptions.BoardException2;
import lightsout.exceptions.MenuException;
import lightsout.models.AskInput;
import lightsout.models.Board;
import lightsout.views.HelpMenuView;

/**
 *
 * @author Clinton
 */
    public class MainMenuControl implements Serializable, lightsout.interfaces.Random, lightsout.interfaces.ErrorInfo {
    Board myBoard;
    JTable myTable;
    public Status quitGame(){
        System.out.println("Thanks for playing!");
        return Status.QUIT;
    }
    
    public MainMenuControl(Board board, JTable myTable){
        this.myBoard = board;
        this.myTable = myTable;
    }
    
    public Status changeLight(){
        //Get input
        AskInput myAsk = new AskInput(this.myBoard);
        boolean tryAgain = false;
        //Must set initial as 0,0 or it will have a cow and say "may not have been initialized"
        int[] validLocation = {0,0};
        
        do{
            try{
                String location = myAsk.getLocation();
                validLocation = this.myBoard.validLocation(location);
                tryAgain = false;
            }
            catch (BoardException2 be){
                errormsg("Not a valid option!");
                tryAgain = true;
            }
            catch(ArrayIndexOutOfBoundsException e){
                errormsg("You must enter both a column AND a row");
                tryAgain = true;
            }
        }
        while(tryAgain);
        int columnInt = validLocation[0];
        int rowInt = validLocation[1];
        
        //Change that light!
        Board.Light light = this.myBoard.new Light(this.myBoard);
        light.changeLight(columnInt, rowInt);
                
        //Get neighbors and change them
        int lightAbove;
        int lightBelow;
        int lightRight;
        int lightLeft;
        if(columnInt > 0)
          {
              lightLeft = columnInt - 1;
              light.changeLight(lightLeft, rowInt);
          }
        if(columnInt < 4)
          {
              lightRight = columnInt + 1;
              light.changeLight(lightRight, rowInt);
          }
        if(rowInt > 0)
          {
              lightAbove = rowInt - 1;
              light.changeLight(columnInt, lightAbove);
          }
        if(rowInt < 4)
          {
              lightBelow = rowInt + 1;
              light.changeLight(columnInt, lightBelow);
          }
                               
        
        //Check to see if game is done
        if (this.myBoard.checkBoard() == 0){
            return Status.SOLVED;
        }
        return Status.IN_PROGRESS;
    }
     public Status changeLight(int clickedCol, int clickedRow){
        int columnInt = clickedCol;
        int rowInt = clickedRow;
        
        //Change that light!
        Board.Light light = this.myBoard.new Light(this.myBoard);
        light.changeLight(columnInt, rowInt);
                
        //Get neighbors and change them
        int lightAbove;
        int lightBelow;
        int lightRight;
        int lightLeft;
        if(columnInt > 0)
          {
              lightLeft = columnInt - 1;
              light.changeLight(lightLeft, rowInt);
          }
        if(columnInt < 4)
          {
              lightRight = columnInt + 1;
              light.changeLight(lightRight, rowInt);
          }
        if(rowInt > 0)
          {
              lightAbove = rowInt - 1;
              light.changeLight(columnInt, lightAbove);
          }
        if(rowInt < 4)
          {
              lightBelow = rowInt + 1;
              light.changeLight(columnInt, lightBelow);
          }
                               
        //Check to see if game is done
        if (this.myBoard.checkBoard() == 0){
            return Status.SOLVED;
        }
        return Status.IN_PROGRESS;
    }
    
    public Status newGame(){
        this.myBoard = new Board(myTable);
        this.createBoard();
        return Status.IN_PROGRESS;
    }
    
    public Status showLightsOn(){
        int lightsLeft = this.myBoard.checkBoard();
        if(lightsLeft == 0){
            System.out.println("You have won the game!");
            return Status.SOLVED;
        }
        else{
            System.out.println("You still have " + lightsLeft + " spaces left");
            return Status.IN_PROGRESS;
        }   
    }
    
    public int getLightsLeft(){
        int lightsLeft = this.myBoard.checkBoard();
        return lightsLeft;
    }
   
    public Status displayBoard(){
        this.myBoard.display();
        return Status.IN_PROGRESS;
    }
    
    public Status displayHelp(){
        HelpMenuView myHelpMenu = new HelpMenuView();
        Status theReturn;
        do {
            try{
                myHelpMenu.displayMenu();
                theReturn = myHelpMenu.processMenuInput();
            }
            catch(MenuException e){
                errormsg("Not a valid menu option.\nPlease try again.");
                theReturn = Status.ERROR;
            }
           }
        while (theReturn == Status.CONTINUE || theReturn == Status.ERROR);
        return Status.IN_PROGRESS;
    }

    @Override
    public void errormsg(String message) {
        System.out.println(message);
    }
    
    public void createBoard(){
    int numOfLightsThisRow;
    int randInArray;
    int maxLightsInRow = 3;
    for(int h=0; h < 5; h++)
        {
            //Max is set at 3 currently...
            numOfLightsThisRow = randInt(0, maxLightsInRow);
            for(int i=0; i < numOfLightsThisRow; i++)
            {
                randInArray = randInt(0, 4);
                this.changeLight(randInArray, h);
            }
        }
    }
    
    @Override
    public int randInt(int min, int max){
    // Usually this can be a field rather than a method variable
    java.util.Random rand = new java.util.Random();

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
    }
}
