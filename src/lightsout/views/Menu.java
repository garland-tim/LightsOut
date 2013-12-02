/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.views;
import lightsout.enums.Status;
import lightsout.models.AskInput;
/**
 *
 * @author Clinton
 */
public abstract class Menu implements lightsout.interfaces.DisplayInfo, lightsout.interfaces.EnterInfo {
    private String[][] menuItems;
    
    public Menu(String[][] menuItems){
        this.menuItems = menuItems;
    }
    
    @Override
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
    
    @Override
    public String getInput(){
            AskInput myAsk = new AskInput();
            String mainMenuInput = myAsk.askMenuInput();
            return mainMenuInput;
    }
    
    public abstract Status processMenuInput();
}
