/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.models;

import java.io.Serializable;
import lightsout.models.AskInput;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class Player implements Serializable {
    private String name;

    public Player() {
        
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

    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}
