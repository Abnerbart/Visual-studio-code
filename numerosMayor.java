
import javax.swing.JOptionPane;


public class numerosMayor {

    public static void main(String[] args) {
        
        int n1=0, n2=0 ,n3=0, n4=0, nmayor=0 ;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Indicar el n1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Indicar el n2"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Indicar el n3"));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Indicar el n4"));

        nmayor = n1;

        if(n2 > nmayor){
            nmayor = n2;
            }if(n3 > nmayor){
                nmayor = n3;
                }if(n4 > nmayor){
                    nmayor = n4;
        }
        JOptionPane.showMessageDialog(null,"El numero mayor es el " + nmayor);
    }
}
