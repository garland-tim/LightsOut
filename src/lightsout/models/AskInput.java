/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.models;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;
import lightsout.exceptions.BoardException2;

/**
 *
 * @author Tim
 */
public class AskInput implements Serializable {
    private Board board;
    
    public AskInput(){
        
    }    
    
    public String askName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        return input.next();
    }
        
    public AskInput(Board board){
        this.board = board;
    }
    
    public String askMenuInput(){
       String menuInput;
       Scanner input = new Scanner(System.in);
       menuInput = input.next();
       menuInput = menuInput.toUpperCase();
       return menuInput;
    }
    
    /**
     *
     * @param message
     */
    
    public String getLocation(){
        String location;
        
        //Loop 
        while (true) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the light you would like to change: ");
        location = input.next();
        return location;
        }
    }

    @Override
    public String toString() {
        return "AskInput{" + "board=" + board + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.board);
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
        final AskInput other = (AskInput) obj;
        if (!Objects.equals(this.board, other.board)) {
            return false;
        }
        return true;
    }
    
}