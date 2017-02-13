

package exemploherdanza;

import javax.swing.JOptionPane;

public class Xenerica <T>{
    
    private T variable;
    
    public Xenerica (){
        variable = null;
    }

    public T getVariable() {
        return variable;
    }

    public void setVariable(T variable) {
        this.variable = variable;
    }
    
    public void amosar (){
        JOptionPane.showMessageDialog(null,variable );
    }

}
