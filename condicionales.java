

import javax.swing.JOptionPane;

public class condicionales {

    public static void main(String[] args) {
     
        // Indicar las variables
    int edad = 0;
    String nombre = "";

        // Entrada de datos
    nombre = JOptionPane.showInputDialog("Indica el name");
    edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));

        //Implicación lógica
        if(edad >= 18){
            // Camino del verdadero
            JOptionPane.showMessageDialog(null, nombre + " Podes votar ");
        }else{// Camino del Falso
            JOptionPane.showMessageDialog(null, nombre +" no podes votar");      
          
        }
    }
}
