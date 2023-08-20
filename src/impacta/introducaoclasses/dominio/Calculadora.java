package impacta.introducaoclasses.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairNumeros() {
        System.out.println(20 - 30);
    }

    public void multiplicarDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros2(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return 0;
        }

    }

    public double divideDoisNumeros3(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;

        }
        return 0;
    }

    public void divideDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não é possivel dividir por Zero");

        }
    }

    public void alterrarDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

    }

    public void somaArray(int [] number) {
        int soma = 0;
        for(int num : number){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... number) {
        int soma = 0;
        for(int num : number){
            soma += num;
        }
        System.out.println("Buscando valores do Array e somando: " + soma);
    }




}
