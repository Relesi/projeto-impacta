package impacta.exercicios;

/*
        1-Escreva um programa Java para imprimir o resultado das seguintes operações.
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
        Saída Esperada:
        43
        1
        19
        13

 */


public class Exercicio1 {

    public static void main(String[] args) {
        int op1 = -5 + 8 * 6;
        System.out.println(op1);
        int op2 = (55+9) % 9;
        System.out.println(op2);
        int op3 = 20 + -3*5 / 8;
        System.out.println(op3);
        int op4 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(op4);
    }
}
