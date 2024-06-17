/*

Escriba un programa que calcule la suma y el promedio de cuatro
números de tipo entero y que posteriormente los muestre al usuario.
Usted le asigna los valores a las variables

*/

public class calcularPromedio1 {

    public static void main(String[] args) {
        
    int a = 10;
    int b = 10;
    int c = 10;
    int d = 10;

    double calcular_promedio = (a + b + c + d);

    double promedio = calcular_promedio / 4;

    System.out.println("El promedio es " + promedio);

    } 
}
