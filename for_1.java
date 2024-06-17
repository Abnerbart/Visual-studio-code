
import javax.swing.JOptionPane;

public class for_1 {
    
    public static void main(String[] args) {

        String lista = "";
        String lista2 = "";
         
        for (int i = 0; i < 5; i++) { // Bucle for
            lista += ("I vale:" +i) +"\n";// Acumulando datos de texto en una lista

        }
        
        for(int i= 10; i> 0; i--){
            lista2 += (+i) +"\n";// Acumulando datos de texto en una lista
        }
        JOptionPane.showMessageDialog(null, lista); // Impresión del bucle fuera del acumulado 
        JOptionPane.showMessageDialog(null,  lista2 +"Feliz año nuevo" );
    }
}
