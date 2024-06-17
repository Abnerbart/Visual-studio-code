

import javax.swing.JOptionPane;

public class nombreDia {
    
    public static void main(String[] args) {
        
        int numeroDia = 0;

       numeroDia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del día"));

       switch(numeroDia){
           case 1: 
                JOptionPane.showMessageDialog(null, "Domingo");
               break;
            case 2:
                JOptionPane.showMessageDialog(null, "Lunes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Martes");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Miercoles");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Jueves");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "viernes");
                break;
            default:
               JOptionPane.showMessageDialog(null, "Sabado");
                break;
       }else{
        JOptionPane.showMessageDialog(null,"Digite del 1 al 7");
       }
    }
    
}
