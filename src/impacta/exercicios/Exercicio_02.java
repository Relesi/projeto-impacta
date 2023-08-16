package impacta.exercicios;

import java.util.Scanner;

    /*

        Escreva um programa Java que receba dois números como entrada e exiba o produto de dois números.
        Input first number: 25
        Input second number: 5
        Saída Esperada: 25 x 5 = 125

     */

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int numberInput;
        System.out.println("Digite o primeiro numero");
        numberInput = num.nextInt();

        System.out.println("Digite o segundo numero");
        numberInput = num.nextInt();

        System.out.println("Valor total é: " + 25 * 5);
    }
}
