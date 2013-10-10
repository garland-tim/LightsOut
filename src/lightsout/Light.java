/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

/**
 *
 * @author Clinton
 */
public class Light {
    int on = 0;
    String symbol = "X";
    
    public void displayDefaults(){
        System.out.println("On/Off: " + this.on);
        System.out.println("Symbol: " + this.symbol);
    }

}
