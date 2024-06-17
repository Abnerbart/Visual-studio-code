
/*
Desarrolle un programa que calcule el porcentaje de gastos por
concepto de alimentación y el porcentaje que queda disponible
para otros gastos. Debe proporcionar como datos de entrada el
monto de ingreso mensual y el gasto mensual por alimentación.

 */

import javax.swing.JOptionPane;

public class PorcentajeDeGastos5 {

    public static void main(String[] args) {
        
        double ingresoMensual = 0;
        double gastosAlimentación = 0;
        double Disponible = 0;
        double porAlimentación = 0;
        double porDisponible = 0;

        //solicitud de datos 

        ingresoMensual = Double.parseDouble(JOptionPane.showInputDialog("Indique el salario"));
        gastosAlimentación = Double.parseDouble(JOptionPane.showInputDialog("Indique los gastos "));
        

        // Operaciones
        Disponible = ingresoMensual - gastosAlimentación;

        porAlimentación = (gastosAlimentación * 100) / ingresoMensual;
        porDisponible = (Disponible * 100) / ingresoMensual;

        JOptionPane.showMessageDialog(null, "Me quedan: " + porAlimentación + "\n Y el disponible de: " + porDisponible);


    }
    
}
