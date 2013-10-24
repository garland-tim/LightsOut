/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;
import java.util.Random;

/**
 *
 * @author Clinton
 */

public class Board {
    int boardHeight = 5;
    int boardWidth = 5;
    String[] topLabels = {"A","B","C","D","E"};
    String[] sideLabels = {"1","2","3","4","5"};
    char onSymbol = (char)88;
    char offSymbol = (char)32;
    int lightsOnStart = 7;
    
    //Here is the default board - change later
            int[][] boardArray = new int[][]{
            { 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0}
        };
    
    public Board(){
        this.createBoard();
    }
    
    public void createBoard(){
        int numOfLightsThisRow;
        int randInArray;
        int maxLightsInRow = 3;
        for(int h=0; h < this.boardArray.length; h++)
        {
            //Max is set at 2 currently...
            numOfLightsThisRow = randInt(0, maxLightsInRow);
            for(int i=0; i < numOfLightsThisRow; i++)
            {
                randInArray = randInt(0, this.boardArray[h].length-1);
                this.boardArray[h][randInArray] = 1;
            }
        }
    }
    
    public static int randInt(int min, int max) {

    // Usually this can be a field rather than a method variable
    Random rand = new Random();

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
    }
    
    public void displayBoard(){
        //Top Row
        String topRow = "   ";
        for(int i=0; i < this.topLabels.length; i++)
        {
            topRow += "  "+ topLabels[i] +" ";
        }
        System.out.println(topRow);
        
        for(int h=0; h < this.boardHeight; h++)
        {
            String boardLines = "   =";
            for(int w=0; w < this.boardWidth; w++)
            {
                boardLines += "====";
            }
            System.out.println(boardLines);
            boardLines = " "+ this.sideLabels[h] +" |";
            for(int w=0; w < this.boardWidth; w++)
            {
                //If light is on
                if(this.boardArray[h][w] == 1)
                {
                    boardLines += " " + this.onSymbol + " |";
                }
                //If light is not on
                else{
                    boardLines += " " + this.offSymbol + " |";
                }
            }
            System.out.println(boardLines);
        }
        
        //Bottom =========
        String boardLines = "   =";
        for(int w=0; w < this.boardWidth; w++)
          {
              boardLines += "====";
          }
        System.out.println(boardLines);
    }
}
