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
public abstract class SayHello implements Serializable{
    private final static int var1 = 1;
    private final static int var2 = 7;
    public SayHello(){
        
    }
    public void displayHello(){
        System.out.println("Hello to the world!");
    }
    public int addition(int var1, int var2){
        return var1 + var2;
    }
    public void displayAddition(){
        System.out.println("Addition:" + addition(this.var1, this.var2));
    }

    public int getVar1() {
        return var1;
    }

    public int getVar2() {
        return var2;
    }
    
    public abstract void sayBye();

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SayHello other = (SayHello) obj;
        if (this.var1 != other.var1) {
            return false;
        }
        if (this.var2 != other.var2) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SayHello{" + "var1=" + var1 + ", var2=" + var2 + '}';
    }
    
}
