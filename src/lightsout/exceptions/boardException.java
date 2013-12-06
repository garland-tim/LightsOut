/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.exceptions;

/**
 *
 * @author Clinton
 */
public class boardException extends Exception {
    public boardException(String message){
        super(message);
    }
    public boardException(String message, Throwable cause){
        super(message, cause);
    }
    public boardException(Throwable cause){
        super(cause);
    }
}
