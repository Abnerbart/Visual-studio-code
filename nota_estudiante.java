
import javax.swing.JOptionPane;

public class nota_estudiante {
    public static void main(String[] args) {
        
        String nombre = "";
        int nota = 0;
        
        JOptionPane.showInputDialog("Introduce el nombre del estudiante");
        Double.parseDouble(JOptionPane.showInputDialog("Indica la nota del estudiante"));

        if(nota >= 70){
            JOptionPane.showMessageDialog(null,nombre + " paso el curso" );
        }else{
            JOptionPane.showMessageDialog(null,nombre + " No paso el curso");
        }
    }
}
