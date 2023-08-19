package impacta.condicionais;

    /*
    
            Imprima o dia da semama, considerando 1 como Domingo
            Ex: IF ELSE
     */

public class EstruturaCondicionaisAndSwitchCase {
    public static void main(String[] args) {
        byte dia1 = 5;
        if (dia1 == 1) {
            System.out.println("Domingo");
        } else if (dia1 == 2) {
            System.out.println("Segunda");
        } else if (dia1 == 3) {
            System.out.println("Terça");
        } else if (dia1 == 4) {
            System.out.println("Quarta");
        } else if (dia1 == 5) {
            System.out.println("Quinta");
        } else if (dia1 == 6) {
            System.out.println("Sexta");
        } else {
            System.out.println("Sabaso");
        }

        /*

            Imprima o dia da semama, considerando 1 como Domingo
            Ex: Switch cas
     */

        byte dia = 8;

        switch (dia) {

            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção Inválida!");
        }


         /*

            Imprima o dia da semama, considerando 1 como Domingo
            Ex: Switch cas
     */


        char sexo = 'F';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }

    }


}
