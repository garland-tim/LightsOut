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
    
    
    public void displayDefaults() {
        System.out.println("Default Height: " + this.boardHeight);
        System.out.println("Default Width: " + this.boardWidth);
    }
}
