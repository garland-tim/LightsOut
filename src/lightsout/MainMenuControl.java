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
        if (this.myBoard.checkBoard() == 0)
            System.out.println("You just done won the game!  Press m for Main Menu!");
    }
    
    public void newGame(){
        this.myBoard = new Board();
    }
    
    public void showLightsOn(){
        int lightsLeft = this.myBoard.checkBoard();
        if(lightsLeft == 0)
        {
            System.out.println("You have won the game!");
        }
        else
        {
            System.out.println("You still have " + lightsLeft + " spaces left");
        }
    }
    
    public void displayBoard(){
        this.myBoard.displayBoard();
    }
    
    public void easterEgg(){
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
    
     public static void sortStringBubble( String  x [ ] )
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
