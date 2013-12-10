/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.controls;

/**
 *
 * @author Tim
 */
public abstract class Goodbye extends Goodbye2 {
    public void Goodbye(){
     this.displayGoodbye();
     this.displaySubtraction();
    }
    
    @Override
    public void ByeBye(){
        System.out.println("Bye for now");
    }
}
