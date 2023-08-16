package impacta.exercicios;


/*
            Escreva um programa Java para contar as letras, espaços, números e outros caracteres de uma string de entrada.
            Saída Esperada:
            A string é: A realidade é meramente uma ilusão, embora muito persistente – (Albert Einstein)
            letra: 23
            espaço: 9
            número: 10
            outro: 6



 */

import java.util.Scanner;

public class Exercicio_09 {

    public static void main(String[] args) {
        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        count(test);

    }

    public static void count(String x) {
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int otherchat = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                otherchat++;
            }
        }
        System.out.println("The string is : The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + otherchat);
    }

}
