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
    
    public AskInputLight(){
        this.getInput();
    }
    
    public void getInput() {
        while (ask == 0) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the light you would like to change: ");
        this.address = input.next();
        
        String[] location = this.address.split("");
        String column = location[0].toUpperCase();
        String row = location[1];
        if(!"A".equals(column) || !"B".equals(column) || !"C".equals(column) || !"D".equals(column) || !"E".equals(column))
        {
            System.out.println("Please enter a valid column option.");
        }
        //Column is valid
        else{
            if(!"1".equals(row) || !"2".equals(row) || !"3".equals(row) || !"4".equals(row) || !"5".equals(row))
            {
                System.out.println("Please enter a valid row option.");
            }
            //Row is Valid
            else
            {
                changeLight(column, row);
                ask = 1;
            }
           }
        }
    }
    
    public void changeLight(String column, String row){
        int state;
        int columnInt = convertColToInt(column);
        int rowInt = convertRowToInt(row);
        
        System.out.println("You have selected in the array ["+columnInt+","+rowInt+"].");
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