/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;
/**
 *
 * @author Clinton
 */


public class MainMenuView {
    private final static String[][] menuItems = {
    {"S", "See array sort"},
    {"T", "Tim's Lesson 6"},
    {"G", "Goodman's Lesson 6"},
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
        this.displayMainMenu();
        myMainControl.newGame();
        myMainControl.displayBoard();
        int theReturn;
        do {
            theReturn = this.runMenu();
           }
        while (theReturn != 1);
    }

    public MainMenuControl getMyMainControl() {
        return myMainControl;
    }

    public void setMyMainControl(MainMenuControl myMainControl) {
        this.myMainControl = myMainControl;
    }
    
    private int runMenu(){
        int myReturn = 0;
            AskInput myAsk = new AskInput();
            String mainMenuInput = myAsk.askMenuInput();
            switch (mainMenuInput) {
                case "Q":
                    this.myMainControl.quitGame();
                    myReturn = 1;
                    break;
                case "N":
                    this.myMainControl.newGame();
                    myMainControl.displayBoard();
                    break;
                case "M":
                    this.displayMainMenu();
                    break;
                case "B":
                    myMainControl.displayBoard();
                    break;
                case "L":
                    this.myMainControl.showLightsOn();
                    break;
                case "T":
                    this.myMainControl.Tim();
                    break;
                case "G":
                    this.myMainControl.Goodman();
                    break;
                case "C":
                    this.myMainControl.changeLight();
                    myMainControl.displayBoard();
                    break;
                case "S":
                    this.myMainControl.arraySample();
                    break;
                case "H":
                    this.myMainControl.displayHelp();
                    this.displayMainMenu();
                    myMainControl.displayBoard();
                    break;
                default:
                    this.myMainControl.errorMessage();
                    myReturn = -1;
            }
            return myReturn;
    }
    
    private void displayMainMenu()
    {
        System.out.println("=============== Main Menu ===============");
        for(int i = 0; i < MainMenuView.menuItems.length; i++)
        {
            System.out.println("\t" + this.menuItems[i][0] + "\t" + this.menuItems[i][1]);
        }
        System.out.println("=========================================");
    }
    
    private class MainMenuControl implements Serializable {
    Board myBoard;
    
    public void quitGame(){
        System.out.println("Thanks for playing!");
    }
    
    public MainMenuControl(){
    }
    
    public void changeLight(){
        //Get input
        AskInput myAsk = new AskInput(this.myBoard);
        int[] location = myAsk.getLocation();
        int columnInt = location[0];
        int rowInt = location[1];
        
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
        }
    }
    
    public void newGame(){
        this.myBoard = new Board();
    }
    
    public void showLightsOn(){
        int lightsLeft = this.myBoard.checkBoard();
        if(lightsLeft == 0)
            System.out.println("You have won the game!");
        else
            System.out.println("You still have " + lightsLeft + " spaces left");
    }
    
    public void displayBoard(){
        this.myBoard.displayBoard();
    }
    
    public void displayHelp(){
        HelpMenuView myHelpMenu = new HelpMenuView();
        int theReturn;
        do {
            myHelpMenu.displayHelpMenu();
            theReturn = myHelpMenu.processMenuInput();
           }
        while (theReturn != 1);
    }
    
    public void errorMessage(){
        System.out.println("Somethings fishy here.... invalid command");
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
