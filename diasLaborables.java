import javax.swing.JOptionPane;

public class diasLaborables {
    public static void main(String[] args) {
        
        int numeroDia = 0;

        numeroDia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número del día"));

        switch(numeroDia){
           case 1: 
                JOptionPane.showMessageDialog(null, "Domingo Dia libre");
               break;
            case 2:
                JOptionPane.showMessageDialog(null, "Lunes Laboral");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Martes Laboral");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Miercoles Laboral");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Jueves Laboral");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "viernes Laboral");
                break;
            default:
               JOptionPane.showMessageDialog(null, "Sabado algunos laboral y otros libre");
                break;
       }
    }
    
}

    
    

