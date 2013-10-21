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
    String[] sideLabels = {"1","2","3","4","5"};
    
    public Board(){
    }
    
    public void displayBoard(){
        //Top Row
        String topRow = "   ";
        for(int i=0; i < this.topLabels.length; i++)
        {
            topRow += " "+ topLabels[i] +" ";
        }
        System.out.println(topRow);
        
        for(int h=0; h < this.boardHeight; h++)
        {
            String boardLines = "   =";
            for(int w=0; w < this.boardWidth; w++)
            {
                boardLines += "===";
            }
            System.out.println(boardLines);
            boardLines = " "+ this.sideLabels[h] +" |";
            for(int w=0; w < this.boardWidth; w++)
            {
                boardLines += "  |";
            }
            System.out.println(boardLines);
        }
        
        //Bottom =========
        String boardLines = "   =";
        for(int w=0; w < this.boardWidth; w++)
          {
              boardLines += "===";
          }
        System.out.println(boardLines);
    }
}
