/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.views;

import java.io.Serializable;
import java.util.Objects;
import lightsout.models.AskInput;
import lightsout.controls.HelpMenuControl;
import lightsout.enums.Status;
import lightsout.exceptions.MenuException;
/**
 *
 * @author Clinton
 */


public class HelpMenuView extends Menu implements Serializable  {
    
    private static final String[][] menuItems = {
    {"L", "The Light"},
    {"B", "The Board"},
    {"R", "The Rules"},
    {"P", "The Player"},
    {"Q", "Quit Help"}
};

    public HelpMenuView() {
        super(HelpMenuView.menuItems);
    }

    public HelpMenuControl getMyMenuControl() {
        return myMenuControl;
    }

    public void setMyMenuControl(HelpMenuControl myMenuControl) {
        this.myMenuControl = myMenuControl;
    }

    public AskInput getMyAsk() {
        return myAsk;
    }

    public void setMyAsk(AskInput myAsk) {
        this.myAsk = myAsk;
    }
    
    
    HelpMenuControl myMenuControl = new HelpMenuControl();
    AskInput myAsk = new AskInput();
    @Override
    public Status processMenuInput() throws MenuException{
        Status myReturn;
        String helpInput = this.getInput();
            switch (helpInput) {
                case "L":
                    this.myMenuControl.displayLightHelp();
                    myReturn = Status.CONTINUE;
                    break;
                case "B":
                    this.myMenuControl.displayBoardHelp();
                    myReturn = Status.CONTINUE;
                    break;
                case "R":
                    this.myMenuControl.displayRulesHelp();
                    myReturn = Status.CONTINUE;
                    break;
                case "P":
                    this.myMenuControl.displayPlayerHelp();
                    myReturn = Status.CONTINUE;
                    break;
                case "Q":
                    myReturn = Status.RETURN;
                    break;
                default:
                    myReturn = Status.ERROR;
                    throw new MenuException();
            }
            return myReturn;
    }
    


    @Override
    public String toString() {
        return "HelpMenuView{" + "myMenuControl=" + myMenuControl + ", myAsk=" + myAsk + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.myMenuControl);
        hash = 37 * hash + Objects.hashCode(this.myAsk);
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
        final HelpMenuView other = (HelpMenuView) obj;
        if (!Objects.equals(this.myMenuControl, other.myMenuControl)) {
            return false;
        }
        if (!Objects.equals(this.myAsk, other.myAsk)) {
            return false;
        }
        return true;
    }
    
}
