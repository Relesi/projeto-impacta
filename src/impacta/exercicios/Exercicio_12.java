package impacta.exercicios;


    /*

        Escreva um programa Java para aceitar um número e verificar se o número é par ou não.
        Imprime 1 se o número for par ou 0 se o número for ímpar.
            Saída de amostra:

            Digite um número: 20
            1
     */

import java.util.Scanner;

public class Exercicio_12 {

    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int number = 3;

        System.out.println("Digite o numero");
        number = inputNum.nextInt();

        if (number % 2 == 0)
            System.out.println(1);
        else
            System.out.println(0);
    }

}
