/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.models;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Tim
 */
public class AskInput implements Serializable, lightsout.interfaces.ErrorInfo {
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
    @Override
    public void errormsg(String message) {
        System.out.println(message);
    }
    public int[] getLocation() {
        String location;
        Integer doContinue = 1;
        
        //Loop 
        while (true) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the light you would like to change: ");
        location = input.next();
        
        //Separate column and row
        String[] split = location.split("");
        String column = split[1].toUpperCase();
        String row = split[2];
        
        //Is column A-E?
        if(!column.equals("A") && !column.equals("B") && !column.equals("C") && !column.equals("D") && !column.equals("E"))
        {
            errormsg("Please enter a valid column option.");
        }
        //Column is valid
        else{
            if(!"1".equals(row) && !"2".equals(row) && !"3".equals(row) && !"4".equals(row) && !"5".equals(row))
            {
                errormsg("Please enter a valid row option.");
            }
            //Row is Valid
            else
            {
                //Convert "A5" style to "[0,4]" style
                int columnInt = board.convertColToInt(column);
                int rowInt = board.convertRowToInt(row);
                
                //This was a valid option, so you can close this method
                return new int[]{columnInt, rowInt};
            }
           }
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