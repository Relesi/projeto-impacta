package impacta.introducaoclasses.dominio.print;

import impacta.introducaoclasses.dominio.Calculadora;

public class PrintTestCalculadora4 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;

        calculadora.alterrarDoisNumeros(a,b);
        System.out.println("Dentro da Impressão");
        System.out.println("num1: " + a );
        System.out.println("num1: " + b );
    }
}
