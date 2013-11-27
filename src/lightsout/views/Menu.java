/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.views;
import lightsout.Status;
/**
 *
 * @author Clinton
 */
public abstract class Menu {
    private String[][] menuItems;
    
    public Menu(String[][] menuItems){
        this.menuItems = menuItems;
    }
    
    public Status displayMenu()
    {
        System.out.println("================= Menu ==================");
        System.out.println("Please enter the letter for your choice: ");
        for(int i = 0; i < this.menuItems.length; i++)
        {
            System.out.println("\t" + this.menuItems[i][0] + "\t" + this.menuItems[i][1]);
        }
        System.out.println("=========================================");
        return Status.IN_PROGRESS;
    }
    public abstract Status processMenuInput();
}
