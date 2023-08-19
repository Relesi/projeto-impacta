package impacta.exercicios;


    /*

        Escreva um programa Java para imprimir números entre 1 e 100 que são divisíveis por 3, 5 e por ambos.
        Saída de amostra:

        Dividido por 3:
        3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
        , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,

        Dividido por 5:
        5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
        95,

        Dividido por 3 e 5:
        15, 30, 45, 60, 75, 90,
     */

public class Exercicio_11 {
    public static void main(String[] args) {

        System.out.println("\nDivido por 3: ");
        for (int i = 1; i < 100; i++ ){
            if (i % 3 == 0) {
                System.out.println(i + ", ");
            }
        }

        System.out.println("\nDivido por 5: ");
        for (int i = 1; i < 100; i++ ){
            if (i % 5 == 0) {
                System.out.println(i + ", ");
            }
        }

        System.out.println("\nDividido por 3 e 5:" );
        for (int i = 1; i < 100; i++ ){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ", ");
            }
        }


    }
}
