package impacta.exercicios;


/*
    Escreva um programa Java para converter um número decimal em um número hexadecimal.
    Dados de entrada: Insira um número decimal: 15
    Saída Esperada O número hexadecimal é: F

 */

import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = toHex(input.nextInt());
        System.out.println(a);
    }

    public static String toHex(int number) {
        return Integer.toHexString(number);
    }

}
