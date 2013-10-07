/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class AskInput {
    String column;
    String row;
    
    public void askInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the square you would like to change: ");
        this.column = input.next();
        this.row = input.next();
    }
}
