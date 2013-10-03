/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

/**
 *
 * @author Tim
 */
public class Player {
    String name;
    int wins = 0;
    
    public void displayWins() {
        System.out.println("Wins: " + this.wins);
    }
}
