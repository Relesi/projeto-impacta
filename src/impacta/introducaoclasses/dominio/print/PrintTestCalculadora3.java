package impacta.introducaoclasses.dominio.print;

import impacta.introducaoclasses.dominio.Calculadora;

public class PrintTestCalculadora3 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double result1 = calculadora.divideDoisNumeros(20, 0);
        System.out.println(result1);
        System.out.println(calculadora.divideDoisNumeros(20, 2));

        System.out.println("Testando  condição com else");
        double result2 = calculadora.divideDoisNumeros2(20, 0);
        System.out.println(result2);

        System.out.println("Testando condição deferente 0");
        double result3 = calculadora.divideDoisNumeros3(20, 0);
        System.out.println(result3);

        System.out.println("Testando void com retorno");
        calculadora.divideDivisaoDeDoisNumeros(86, 0);
    }
}
