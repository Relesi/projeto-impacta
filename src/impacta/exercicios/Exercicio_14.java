package impacta.exercicios;


    /*

       Escreva um programa Java que aceite um número inteiro (n) e calcule o valor de n+nn+nnn.
            Saída de amostra:

            Número de entrada: 5
            5 + 55 + 555

 */

import java.util.Scanner;

public class Exercicio_14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        String n = in.nextLine();
        if (n.matches("[0-9]+")) {
            System.out.println(n + " + " + n + n + " + " + n + n + n + " = ");
//                    + (Integer.parseInt(n) + Integer.parseInt(n + n) + Integer.parseInt(n + n + n)));
        } else {
            System.out.println("Error: invalid input.");
        }
    }

}
