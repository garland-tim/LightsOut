/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class Calc {
Float tempF;
    Float tempC;
    public void convertToCelcius (){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a temperature in Fahrenheit: ");
        this.tempF = input.nextFloat();
        
        //Check to see if is a float and not a alpha
        if (tempF != (float) tempF){
            System.out.println("/tInput is not valid!");
        }
        else if (tempF < -459){
            System.out.println("/nYou can't go colder than nothing!");
        }
        else {
        tempC = (tempF - 32) * 5 / 9;
        System.out.println("It is " + tempC + " degrees Celcius.");
        }
    }
    
}
