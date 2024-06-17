
/* 
Nombre : Hola mundo  en java
Autor: Abner Vargas
Fecha: 5/25/2024
Universidad: U Fidelitas
Función: Determinar la sintaxis básica de JAVA
Version:1.0

*/
 // 1 - Paquete principal
import javax.swing.JOptionPane;

public class HolaMundo { // 2 - Clase

    public static void main(String[] args) { // 3 - Método Principal
     // 1- Declaración de variables 
     
     String nombre = "";
     int edad = 0;
     
     // 2- Solicitud de datos del usuario
       nombre = JOptionPane.showInputDialog("El nombre por favor");
       
    // 3 - Salida de datos 
    
      JOptionPane.showMessageDialog(null, nombre);
    }
}
