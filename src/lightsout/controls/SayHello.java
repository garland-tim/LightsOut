/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.controls;

import java.io.Serializable;

/**
 *
 * @author Clinton
 */
public abstract class SayHello implements Serializable, lightsout.interfaces.Random {
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
    public int randInt(int min, int max){
    // Usually this can be a field rather than a method variable
    java.util.Random rand = new java.util.Random();

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;
    
    //Changed this to make a polymorphic example
    randomNum = rand.nextInt((randomNum - min) + 1) + min;

    return randomNum;
    }

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
