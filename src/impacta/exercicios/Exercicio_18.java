package impacta.exercicios;


    /*

        Escreva um programa Java para criar e exibir um número único de três dígitos usando 1, 2, 3, 4.
          Conte também quantos números de três dígitos existem.
          Saída Esperada

                123
                124
                ...

                431
                432
                O número total do número de três dígitos é 24


    */




public class Exercicio_18 {

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
