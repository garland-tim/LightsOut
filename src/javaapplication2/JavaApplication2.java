/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Tim
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Calc myCalc = new Calc();
      myCalc.convertToCelcius();
              
        Calc2 myCalc2 = new Calc2();
        myCalc2.getInput();
        float convertToFahren = myCalc2.convertToFahren();
    }
    
}
