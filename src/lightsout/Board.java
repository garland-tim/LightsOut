/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/**
 * @author Clinton
 */

public class Board implements Serializable {
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

    public int getBoardHeight() {
        return boardHeight;
    }

    public void setBoardHeight(int boardHeight) {
        this.boardHeight = boardHeight;
    }

    public int getBoardWidth() {
        return boardWidth;
    }

    public void setBoardWidth(int boardWidth) {
        this.boardWidth = boardWidth;
    }

    public String[] getTopLabels() {
        return topLabels;
    }

    public void setTopLabels(String[] topLabels) {
        this.topLabels = topLabels;
    }

    public String[] getSideLabels() {
        return sideLabels;
    }

    public void setSideLabels(String[] sideLabels) {
        this.sideLabels = sideLabels;
    }

    public int getLightsOnStart() {
        return lightsOnStart;
    }

    public void setLightsOnStart(int lightsOnStart) {
        this.lightsOnStart = lightsOnStart;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public int[][] getBoardArray() {
        return boardArray;
    }

    public void setBoardArray(int[][] boardArray) {
        this.boardArray = boardArray;
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
    
    private static int randInt(int min, int max) {
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
    
public class Light implements Serializable {
    Board board;
    private char onSymbol = (char)88;
    private char offSymbol = (char)32;
    
    public Light(Board board){
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public char getOnSymbol() {
        return onSymbol;
    }

    public void setOnSymbol(char onSymbol) {
        this.onSymbol = onSymbol;
    }

    public char getOffSymbol() {
        return offSymbol;
    }

    public void setOffSymbol(char offSymbol) {
        this.offSymbol = offSymbol;
    }
    
    public void changeLight(int columnInt, int rowInt){
        if(this.board.boardArray[rowInt][columnInt] == 1)
        {
            this.board.boardArray[rowInt][columnInt] = 0;
        }
        else{
            this.board.boardArray[rowInt][columnInt] = 1;
        }
    }

}

    @Override
    public String toString() {
        return "Board{" + "boardHeight=" + boardHeight + ", boardWidth=" + boardWidth + ", topLabels=" + topLabels + ", sideLabels=" + sideLabels + ", lightsOnStart=" + lightsOnStart + ", light=" + light + ", boardArray=" + boardArray + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.boardHeight;
        hash = 67 * hash + this.boardWidth;
        hash = 67 * hash + Arrays.deepHashCode(this.topLabels);
        hash = 67 * hash + Arrays.deepHashCode(this.sideLabels);
        hash = 67 * hash + this.lightsOnStart;
        hash = 67 * hash + Objects.hashCode(this.light);
        hash = 67 * hash + Arrays.deepHashCode(this.boardArray);
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
        final Board other = (Board) obj;
        if (this.boardHeight != other.boardHeight) {
            return false;
        }
        if (this.boardWidth != other.boardWidth) {
            return false;
        }
        if (!Arrays.deepEquals(this.topLabels, other.topLabels)) {
            return false;
        }
        if (!Arrays.deepEquals(this.sideLabels, other.sideLabels)) {
            return false;
        }
        if (this.lightsOnStart != other.lightsOnStart) {
            return false;
        }
        if (!Objects.equals(this.light, other.light)) {
            return false;
        }
        if (!Arrays.deepEquals(this.boardArray, other.boardArray)) {
            return false;
        }
        return true;
    }


}
