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
public abstract class Goodbye2 implements Serializable{
    private final static int var1 = 12;
    private final static int var2 = 5;
    public Goodbye2(){
        
    }
    public void displayGoodbye(){
        System.out.println("Goodbye everyone!");
    }
    public int subtraction(int var1, int var2){
        return var1 - var2;
    }
    public void displaySubtraction(){
        System.out.println("Subtraction:" + subtraction(this.var1, this.var2));
    }

    public int getVar1() {
        return var1;
    }

    public int getVar2() {
        return var2;
    }
    
    public abstract void ByeBye();

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
        final Goodbye2 other = (Goodbye2) obj;
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
        return "Goodbye{" + "var1=" + var1 + ", var2=" + var2 + '}';
    }
    
}
