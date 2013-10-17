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
    int boardHeight = 8;
    int boardWidth = 8;
    String[] topLabels = {"A","B","C","D","E","F","G","H","I"};
    String[] sideLables = {"1","2","3","4","5","6","7","8","9"};
    
    public Board(){
        this.newBoard();
    }
    
    public void newBoard(){
        //Top Row
        for(int h=0; h < this.boardHeight; h++)
        {
            for(int w=0; w < this.boardWidth; w++)
            {
                System.out.println("===");
            }
            System.out.println("  =");
            for(int w=0; w < this.boardWidth; w++)
            {
                System.out.println("===");
            }
        }
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
