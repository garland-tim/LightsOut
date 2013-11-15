/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

import java.io.Serializable;

/**
 *
 * @author Clinton
 */
public class Light implements Serializable {
    Board board;
    private char onSymbol = (char)88;
    private char offSymbol = (char)32;
    
    public Light(Board board){
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public char getOnSymbol() {
        return onSymbol;
    }

    public void setOnSymbol(char onSymbol) {
        this.onSymbol = onSymbol;
    }

    public char getOffSymbol() {
        return offSymbol;
    }

    public void setOffSymbol(char offSymbol) {
        this.offSymbol = offSymbol;
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

}
