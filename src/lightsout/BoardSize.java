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
public abstract class BoardSize {
    
    public String displaySize() {
        String boardSize;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like a normal board or a super board? (Y/N)");
        boardSize = input.next();
        boardSize = boardSize.toUpperCase();
        return boardSize;
    }
    
    public abstract String processBoardSize();
}
