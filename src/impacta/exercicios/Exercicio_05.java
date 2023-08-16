package impacta.exercicios;


/*
    Escreva um programa Java que receba cinco números como entrada para calcular e imprimir a média dos números.

        Insira o primeiro número: 10
        Insira o segundo número: 20
        Insira o terceiro número: 30
        Insira o quarto número: 40
        Insira o quinto número: 50
        Média de cinco números é: 30



 */

import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);

        System.out.println("Enter the first number\n");
        int number1 = print.nextInt();

        System.out.println("Enter the second number\n");
        int number2 = print.nextInt();

        System.out.println("Enter the third number\n");
        int number3 = print.nextInt();

        System.out.println("Enter the fourth number\n");
        int number4 = print.nextInt();

        System.out.println("Enter the fourth number\n");
        int number5 = print.nextInt();

        System.out.println("the average of the numbers are: " + (number1 + number2 + number3 + number4 + number5) / 5);


    }

}
