
import javax.swing.JOptionPane;

/*
 
Escriba un programa que lea el nombre de una persona y la salude, por
ejemplo:
Hola María, bienvenida a este programa desarrollado en JAVA con Netbeans
 
*/

public class Saludar3 {

    public static void main(String[] args) {

    String nombre = "";

    nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");

    JOptionPane.showMessageDialog(null,"Hola " + nombre + " Bienvenido(a) a este programa desarrollado en JAVA con Neatbeans");
        
    }
    
}
