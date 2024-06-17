/*

Desarrolle un programa que calcule el porcentaje de gastos por
concepto de alimentación y el porcentaje que queda disponible
para otros gastos. Debe proporcionar como datos de entrada el
monto de ingreso mensual y el gasto mensual por alimentación.

*/

import java.util.Scanner;

public class Porcentaje_gastos {
     
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el gasto mensual por alimentación");
        double ingreso_mensual = scanner.nextDouble();

        System.out.println("Ingrese los  gastos alimenticios");
        double Alimentos = scanner.nextDouble();

        double porcentaje_alimenticio = (ingreso_mensual / Alimentos) * 100;

        double Porcentaje_otrosGastos =  100 - porcentaje_alimenticio;

        System.out.println("EL porcentaje alimenticio es: " + porcentaje_alimenticio);
        System.out.println("El porcentaje de otros gastos seria: " + Porcentaje_otrosGastos);
    

        }

    }


