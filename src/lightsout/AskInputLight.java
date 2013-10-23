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
    Integer ask = 0;
    
    public void getInput() {
        while (ask == 0) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the light you would like to change: ");
        this.address = input.next();
        
        String[] location = this.address.split("");
        String column = location[0];
        String row = location[1];
        if(column != "A" || column != "B" || column != "C" || column != "D" || column != "E")
            System.out.println("Please enter a valid column option.");
        else
            
            ask = 1;
    }
    }
    
}
