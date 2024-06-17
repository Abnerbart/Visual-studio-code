
import javax.swing.JOptionPane;


public class login {

    public static void main(String[] args) {
        // Variables
        String user = "";
        String password = "";
        int pin = 0;

        // set de valores
        user = "admin";
        password = "1234";
        pin = 7894;

        // solicitud de datos
        user = JOptionPane.showInputDialog("Introduce el usuario");
        password = (JOptionPane.showInputDialog("Introduce el password"));

        if(user.equals("admin")&& password.equals("1234")){
            
            JOptionPane.showMessageDialog(null, "Acceso correcto, introduce el pin");
            pin = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el pin"));
            if(pin == 7894){
                JOptionPane.showMessageDialog(null, "Acceso correcto estas dentro");
            }else{
                JOptionPane.showMessageDialog(null, "PIN incorrecto");
            }

        }else{
            JOptionPane.showMessageDialog(null, "Contraseña incorrecto");            
    }
    
   }
}
