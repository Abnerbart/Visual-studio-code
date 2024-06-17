
import javax.swing.JOptionPane;

public class operacionesBasicas4 {

    public static void main(String[] args) { // Declaracion de variables 
        
        String nombre;
        int edad  = 0;
        int edadFutura = 0;
        double salario = 0;
        double ccss = 0; // Guárdame con el salario * 10%

        // Solicitud de datos al usuario

        nombre = JOptionPane.showInputDialog("Indica el nombre por favor");
        edad = Integer.parseInt(JOptionPane.showInputDialog("indica la edad por favor"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("El salario por favor"));

        // Operaciones básicas

        edadFutura = (edad + 5);
        ccss = salario * 0.10;

        JOptionPane.showMessageDialog(null, "nombre " + nombre + " \nedad " + edad + " \nsalario " + salario + "\nEn 5 años tendrá: " + edadFutura + "\nLa deddución del salario es: " + ccss);
         
    }
}
