/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.exceptions;

/**
 *
 * @author Clinton
 */
public class BoardException extends Exception {
    public BoardException(String message){
        super(message);
    }
    public BoardException(String message, Throwable cause){
        super(message, cause);
    }
    public BoardException(Throwable cause){
        super(cause);
    }
}
