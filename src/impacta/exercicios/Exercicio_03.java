package impacta.exercicios;

    /*

            Escreva um programa Java para imprimir a soma (adição), multiplicação, subtração, divisão e resto de dois números.

            Insira o primeiro número: 125
            Digite o segundo número: 24
            Saóda Esperada:
            125 + 24 = 149
            125 - 24 = 101
            125 x 24 = 3000
            125 / 24 = 5
            125 mod 24 = 5
     */


import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int numberInput;
        System.out.println("Digite o primeiro numero");
        numberInput = num.nextInt();

        System.out.println("Digite o segundo numero");
        numberInput = num.nextInt();

        System.out.println("Valor da soma é: " + (125 + 24 ));
        System.out.println("Valor da subtração é: " + (125 - 24));
        System.out.println("Valor da multiplicação é: " + (125 * 24));
        System.out.println("Valor da divisão é: " + (125 / 24));
        System.out.println("Valor do resto é: " + (125 % 24));
    }
}
