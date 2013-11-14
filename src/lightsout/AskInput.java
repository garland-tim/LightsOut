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
public class AskInput {
    Board board;
    
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
            System.out.println("Please enter a valid column option.");
        }
        //Column is valid
        else{
            if(!"1".equals(row) && !"2".equals(row) && !"3".equals(row) && !"4".equals(row) && !"5".equals(row))
            {
                System.out.println("Please enter a valid row option.");
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
}