 /* 
 
 1. Elabore un programa que calcule cuántos años tendrá el
usuario en 5 años, al finalizar se imprime el siguiente mensaje
“Dentro de 5 años, tendrá: “ y se muestre el valor de la edad
proyectada. Debe solicitar como dato de entrada la edad actual. 

*/

import java.util.Scanner;

public class CalculoEdad {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduzca la edad por favor");
    int edadActual = scanner.nextInt();
    
    int edadFutura = edadActual + 5;

    System.out.println("La edad futura es: " + edadFutura);
    }
}
