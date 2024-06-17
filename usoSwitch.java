
import javax.swing.JOptionPane;

public class usoSwitch {

    public static void main(String[] args) {
        
        // Declaración de las variables

        int opcion = 0;
        String sabor = "",nombre="";
        double precio = 0;

        // Solicitar datos del usuario

        nombre = JOptionPane.showInputDialog("Indicame tu nombre por favor");

        while(true){
            
            // Menu de opciones
            opcion = Integer.parseInt(JOptionPane.showInputDialog(" : : : HELADOS POPS : : :" + "\n Bienvenido " + nombre + "\nSeleccione el sabor"+ "\n1- Vanilla" + "\n2- Chocolate" + "\n3- Fresa" + "\n4- Ron con pasas" + "\n5- Salir"));

            if (opcion < 1 || opcion > 5) {
                JOptionPane.showMessageDialog(null, nombre + " Por favor, indica una opción correcta entre 1 y 5.");
                continue;
            }

        switch(opcion){
            case 1:
                // Helado de vanilla
                sabor = "Vanilla";
                precio = 1000;

                JOptionPane.showMessageDialog(null, nombre + " Escogiste " + sabor + " "+ precio);
                break;

            case 2:
                // Helado de Chocolate
                sabor = "Chocolate";
                precio = 1200;

                JOptionPane.showMessageDialog(null, nombre + " Escogiste " + sabor + " " + precio);
                break;

            
            case 3:
                // Helado de Fresa
                sabor = "Chocolate";
                precio = 1400;

                JOptionPane.showMessageDialog(null, nombre + " Escogiste " + sabor +  " " +precio);
                    
                break;
            case 4:

             // Helado de Ron con pasas
             sabor = "Chocolate";
             precio = 1500;

             JOptionPane.showMessageDialog(null, nombre + " Escogiste " + sabor + " " +precio);
           
                break;
            case 5:
             // Salir
             sabor = "Salir";
             
             JOptionPane.showMessageDialog(null, nombre + " muchas gracias ");
             
                break;
            default: // Excepción salir de la norma.
                JOptionPane.showMessageDialog(null, nombre + " Indica una opcion correcta");
                break;
        }
     }
  }
}