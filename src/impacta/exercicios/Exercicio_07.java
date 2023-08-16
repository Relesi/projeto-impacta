package impacta.exercicios;


/*
            Escreva um programa Java para converter um número decimal em um número octal.
            Dados de entrada:
            Insira um número decimal: 15
            Saída Esperada
            O número octal é: 17

 */

import java.util.Scanner;

public class Exercicio_07 {

    public static void main(String[] args) {

        int dec_num, rem, quot, i = 1, j;
        int oct_num[] = new int[100];
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        dec_num = scan.nextInt();

        quot = dec_num;

        while (quot != 0) {
            oct_num[i++] = quot % 8;
            quot = quot / 8;
        }

        System.out.print("Octal number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(oct_num[j]);
        }
        System.out.print("\n");
    }

}
