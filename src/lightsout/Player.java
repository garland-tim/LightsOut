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
public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void askName() {
        AskInput myAsk = new AskInput();
        this.name = myAsk.askName();
    }
    public void printName(){
        System.out.println("\nWelcome " + this.name + "\n");
    }
}
