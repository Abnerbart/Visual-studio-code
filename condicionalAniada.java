
import javax.swing.JOptionPane;


public class condicionalAniada {
    public static void main(String[] args) {
        
        String nombre = "";
        int edad = 0;

        JOptionPane.showInputDialog("Introduce el nombre");
        Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));

        if(edad < 18){
            JOptionPane.showMessageDialog(null, "Eres menor de edad");
        }else if(edad >= 18 && edad <= 35){
            JOptionPane.showMessageDialog(null, "Eres adulto joven");
        }else if(edad > 35 && edad <= 65){
            JOptionPane.showMessageDialog(null, "Eres adulto mayor");
        }else{
            JOptionPane.showMessageDialog(null, "Eres muy viejo");
        }
    }
}
