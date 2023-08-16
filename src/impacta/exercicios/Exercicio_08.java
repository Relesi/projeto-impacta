package impacta.exercicios;


/*
            Escreva um programa Java para converter um número binário em um número decimal.
            Dados de entrada: Insira um número binário: 100
            Saída Esperada Número Decimal: 4


 */

import java.util.Scanner;

public class Exercicio_08 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long binaryNumber, decimalNumber = 0, j = 1, remainder;
        System.out.print("Input a binary number: ");
        binaryNumber = sc.nextLong();

        while (binaryNumber != 0)
        {
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.println("Decimal Number: " + decimalNumber);
    }

}
