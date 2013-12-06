/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.exceptions;

/**
 *
 * @author Tim
 */
public class MenuException extends Exception{
    public MenuException(){
    }
    public MenuException(String message){
        super(message);
    }
    public MenuException(String message, Throwable clause){
        super(message, clause);
    }
    public MenuException(Throwable clause){
        super(clause);
    }
}
