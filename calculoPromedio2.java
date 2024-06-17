/*
 Modifique el programa anterior, de manera que los valores con los que va
a trabajar sean ingresados por el usuario.
 */

import javax.swing.JOptionPane;

public class calculoPromedio2 {

    public static void main(String[] args) {
        
        double promedio1 = 0;
        double promedio2 =0;
        double promedio3 = 0;
        double promedio4 = 0;
        double promedio_1 = 0;

        promedio1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número"));
        promedio2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número"));
        promedio3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número"));
        promedio4 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número"));

        promedio_1 = (promedio1 + promedio2 + promedio3 + promedio4 ) / 4;

        JOptionPane.showMessageDialog(null, "El promedio es" + promedio_1);
        
    }
}
