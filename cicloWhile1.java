import javax.swing.JOptionPane;

public class cicloWhile1 {
        
    public static void main(String[] args) {
        
        int i = 0;  // variable donde comienza
        int i1 = 1; 
        int suma = 0;

        while(i < 5) // bucle while para hacer la condición
        {
            JOptionPane.showMessageDialog(null, "El valor de I es:" +i);
            i = i+1; // Se hace el incremento fuera del bloque de ejecución
        }

        while( i1 <=10){
            suma += i1;
            ++i1;
        }
            JOptionPane.showMessageDialog(null, suma);
    }
}


