package impacta.exercicios;


    /*

        Escreva um programa Java para imprimir os números ímpares de 1 a 99. Imprime um número por linha.
           Saída de amostra:

            1
            3
            5
            7
            9
            11
            ....

            91
            93
            95
            97
            99
 */

public class Exercicio_13 {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }

}
