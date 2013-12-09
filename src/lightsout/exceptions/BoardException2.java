/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.exceptions;

/**
 *
 * @author Clinton
 */
public class BoardException2 extends Exception{
    public BoardException2(){
        
    }
    public BoardException2(String message){
        super(message);
    }
    public BoardException2 (String message, Throwable cause)
    {
        super(message, cause);
    }
    public BoardException2 (Throwable cause)
    {
        super(cause);
    }
}
