/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

/**
 *
 * @author Tim
 */
public abstract class GoodBye extends Goodbye2 {
    public void Goodbye(){
     this.displayGoodbye();
     this.displaySubtraction();
    }
    
    @Override
    public void ByeBye(){
        System.out.println("Bye for now");
    }
}
