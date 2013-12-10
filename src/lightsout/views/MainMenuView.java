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
import lightsout.Goodbye;
import lightsout.SayHello2;
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
                case "T":
                    this.myMainControl.Tim();
                    myReturn = Status.IN_PROGRESS;
                    break;
                case "G":
                    this.myMainControl.Goodman();
                    myReturn = Status.IN_PROGRESS;
                    break;
                case "C":
                    myReturn = this.myMainControl.changeLight();
                    myMainControl.displayBoard();
                    break;
                case "S":
                    this.myMainControl.arraySample();
                    myReturn = Status.IN_PROGRESS;
                    break;
                case "P":
                    this.myMainControl.goodmanSuperClass();
                    myReturn = Status.IN_PROGRESS;
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
    
    private class MainMenuControl implements Serializable, lightsout.interfaces.ErrorInfo {
    Board myBoard;
    
    public Status quitGame(){
        System.out.println("Thanks for playing!");
        return Status.QUIT;
    }
    
    public MainMenuControl(){
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
            System.out.println("You just done won the game!  Press m for Main Menu!");
            return Status.SOLVED;
        }
        return Status.IN_PROGRESS;
    }
    
    public Status newGame(){
        this.myBoard = new Board();
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
    
    public void goodmanSuperClass(){
        SayHello2 mySuperClass = new SayHello2() {};
        mySuperClass.SayHello2();
    }
    
    @Override
    public void errormsg(String message){
        System.out.println(message);
    }
    
    public Status errorMessage(){
        errormsg("Somethings fishy here.... invalid command");
        return Status.ERROR;
    }
    
    public void arraySample()
    {
             String[ ][ ] names = {
                 {"joe", "slim", "ed", "george"},
                 {"Tim", "Grant", "Clint"},
                 {"Bush", "Clinton", "Boma", "Adams"}
             };
             for(int i = 0; i < names.length; i++)
             {
                sortStringBubble(names[i]);
                System.out.println("Row "+i+" (sorted): ");
                for(int k = 0; k < names[i].length; k++)
                {
                    System.out.println("\t"+names[i][k]);
                }
             }
    }
    
     public void sortStringBubble( String  x [ ] )
      {
            int j;
            boolean flag = true;  // will determine when the sort is finished
            String temp;

            while ( flag )
            {
                  flag = false;
                  for ( j = 0;  j < x.length - 1;  j++ )
                  {
                          if ( x [ j ].compareToIgnoreCase( x [ j+1 ] ) > 0 )
                          {                                             // ascending sort
                                      temp = x [ j ];
                                      x [ j ] = x [ j+1];     // swapping
                                      x [ j+1] = temp; 
                                      flag = true;
                           } 
                   } 
            } 
      } 


    public void Tim(){
        int[] numbers = {2, 5, 9, 11, 3, 6, 21, 2};
        int sum = 0;
        for(int i : numbers) {
            sum += i;
        }
        System.out.println("The average of the numbers is: " + sum / numbers.length);
    }
    public void Goodman(){
        int[] sample_array = {-4, 2, 99, 41, 15, 62, 33, 109, -17, 8};
        int min = sample_array[0];
        for(int i : sample_array){
            if (i < min)
                min = i;
        }
        System.out.println("The lowest (min) number in array: " + min);
    }
}

    @Override
    public String toString() {
        return "MainMenuView{" + "myMainControl=" + myMainControl + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.myMainControl);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MainMenuView other = (MainMenuView) obj;
        if (!Objects.equals(this.myMainControl, other.myMainControl)) {
            return false;
        }
        return true;
    }

}
