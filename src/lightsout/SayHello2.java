/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout;

/**
 *
 * @author Clinton
 */
public abstract class SayHello2 extends SayHello {
    public void SayHello2(){
     this.displayHello();
     this.displayAddition();
    }
    
    @Override
    public void sayBye(){
        System.out.println("Bye now");
    }
}
