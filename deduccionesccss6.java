/*
 Escriba un programa que lea el nombre del trabajador y su salario
semanal, con esta información calcule su salario mensual sin
deducciones (salario bruto), el monto de las deducciones (que
corresponden a un 9.34%) y el salario después de aplicadas las
deducciones (salario neto), finalmente debe mostrar los datos al
usuario de la siguiente manera.
Estimado <<nombre>>, el salario de este mes se desglosa de la
siguiente manera.
Salario bruto: #####.##
Deducciones: #####.##
Salario Neto: #####.##
 */
import javax.swing.JOptionPane;

public class deduccionesccss6 {

    public static void main(String[] args) {
        
        String nombreTrabajador = "";
        double salarioSemanal = 0;
        double deducciones = 0;
        double salarioBruto = 0;
        double salarioNeto= 0;
       
        nombreTrabajador = JOptionPane.showInputDialog("Introduce tu nombre");
        salarioSemanal = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu salario mensual"));

        // Operaciones Matemáticas

        salarioBruto = salarioSemanal * 4;
        deducciones = salarioBruto * 0.0934;
        salarioNeto = salarioBruto - deducciones;

        JOptionPane.showMessageDialog(null, "Salario bruto " + salarioSemanal + "\ndeducciones " + deducciones + "\nsalario Neto es " + salarioNeto);
    }
    
    
}
