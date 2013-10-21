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
public class AskInputLight {
    String address;
    
    public void getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the light you would like to change: ");
        this.address = input.next();
    }
}
