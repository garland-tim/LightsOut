/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;
import java.util.Random;

/**
 * @author Clinton
 */

public class Board {
    private int boardHeight = 5;
    private int boardWidth = 5;
    private String[] topLabels = {"A","B","C","D","E"};
    private String[] sideLabels = {"1","2","3","4","5"};
    private int lightsOnStart = 7;
    private Light light = new Light(this);
    
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
            //Max is set at 3 currently...
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
                    boardLines += " " + this.light.getOnSymbol() + " |";
                }
                //If light is not on
                else{
                    boardLines += " " + this.light.getOffSymbol() + " |";
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
    
    public int checkBoard() {
        int count = 0;
        
        for(int row = 0; row < 5; row ++){
            for(int column = 0; column < 5; column++){
                if(this.boardArray[row][column] == 1)
                        count++;
            }
        }
        return count;
    }
    public int convertColToInt(String column){
        switch(column)
        {
            case "A":
                    return 0;
            case "B":
                    return 1;
            case "C":
                    return 2;
            case "D":
                    return 3;
            case "E":
                    return 4;
        }
        return 0;
    }   
    
    public int convertRowToInt(String row){
        int rowInt;
        rowInt = Integer.parseInt(row);
        return rowInt-1;
    }   
}
