/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

/**
 *
 * @author Clinton
 */

public class Board {
    int boardHeight = 5;
    int boardWidth = 5;
    String[] topLabels = {"A","B","C","D","E"};
    String[] sideLables = {"1","2","3","4","5"};
    
    public Board(){
    }
    
    public void displayBoard(){
        //Top Row
        for(int h=0; h < this.boardHeight; h++)
        {
            String boardLines = "=";
            for(int w=0; w < this.boardWidth; w++)
            {
                boardLines += "===";
            }
            System.out.println(boardLines);
            boardLines = "|";
            for(int w=0; w < this.boardWidth; w++)
            {
                boardLines += "  |";
            }
            System.out.println(boardLines);
        }
        String boardLines = "=";
        for(int w=0; w < this.boardWidth; w++)
          {
              boardLines += "===";
          }
        System.out.println(boardLines);
    }
    
    public void displayDefaults() {
        System.out.println("Default Height: " + this.boardHeight);
        System.out.println("Default Width: " + this.boardWidth);
    }
    
    public void makeBoard(int height, int width){
        for(int x = 0; x < boardWidth; x++)
        {
            System.out.println("\t" + topLabels[x] + "\t");
        }
        System.out.println("\n");
        if(this.boardHeight > 0 && this.boardWidth > 0)
        {
            for (int y = 0; y <= this.boardWidth; y++)
            {
                System.out.println("---");
            }
        }
    }
}
