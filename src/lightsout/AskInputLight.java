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
    Board board;
    
    public AskInputLight(Board board1){
        this.board = board1;
        this.getInput();
    }
    
    public void getInput() {
        while (ask == 0) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the light you would like to change: ");
        this.address = input.next();
        
        String[] location = this.address.split("");
        String column = location[1].toUpperCase();
        String row = location[2];
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
                int columnInt = convertColToInt(column);
                int rowInt = convertRowToInt(row);
                
                //Change that light!
                changeLight(columnInt, rowInt);
                
                //Get neighbors
                int lightAbove;
                int lightBelow;
                int lightRight;
                int lightLeft;
                if(columnInt > 0)
                {
                    lightLeft = columnInt - 1;
                    changeLight(lightLeft, rowInt);
                }
                if(columnInt < 4)
                {
                    lightRight = columnInt + 1;
                    changeLight(lightRight, rowInt);
                }
                if(rowInt > 0)
                {
                    lightAbove = rowInt - 1;
                    changeLight(columnInt, lightAbove);
                }
                if(rowInt < 4)
                {
                    lightBelow = rowInt + 1;
                    changeLight(columnInt, lightBelow);
                }
                                
                //This was a valid option, so you can close this method
                ask = 1;
            }
           }
        }
    }
    
    public void changeLight(int columnInt, int rowInt){
        if(this.board.boardArray[rowInt][columnInt] == 1)
        {
            this.board.boardArray[rowInt][columnInt] = 0;
        }
        else{
            this.board.boardArray[rowInt][columnInt] = 1;
        }
    }
    
    public int convertColToInt(String column){
        switch(column)
        {
            case "A":
                    return 0;
            case "B":
                    return 1;
            case "C":
                    return 2;
            case "D":
                    return 3;
            case "E":
                    return 4;
        }
        return 0;
    }   
    
    public int convertRowToInt(String row){
        int rowInt;
        rowInt = Integer.parseInt(row);
        return rowInt-1;
    }   
}