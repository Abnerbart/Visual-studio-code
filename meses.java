
import javax.swing.JOptionPane;


public class meses {

    public static void main(String[] args) {
        
        int meses = 0;

        meses = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número del mes"));

        if(meses == 2){
            JOptionPane.showMessageDialog(null, "Este mes tiene 28 / 29 días terrestres");

        }else if(meses == 4 || meses == 6 || meses == 9 || meses == 11){
            JOptionPane.showMessageDialog(null, "tienen mas de 30 días");

        }else{
            JOptionPane.showMessageDialog(null, "Tiene mas de 31 días");
        }

        
    }
    
}
