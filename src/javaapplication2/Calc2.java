/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Clinton
 */
public class Calc2 {
    Float tempF;
    Float tempC;
    
    public void getInput()
    {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Celsius: ");
        this.tempC = myInput.nextFloat();
    }
    public float convertToFahren (){
        //Check to see if is a float and not a alpha
        if (tempC != (float) tempC){
            System.out.println("/tInput is not valid!");
            tempF = (float) -2.00;
        }
        else if (tempC < -270){
            System.out.println("/nThat would be below absolute zero kid!");
            tempF = (float) -1.00;
        }
        else {
        tempF = (tempC * 9/5) +32;
        System.out.println("Converted to " + tempF + " degrees Fahrenheit.");
        }
        return tempF;
    }
}
