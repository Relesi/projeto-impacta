package impacta.introducaoclasses.dominio.print;

import impacta.introducaoclasses.dominio.Calculadora;

public class PrintTestCalculadora5 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] number = {1, 2, 3, 4, 5};

        calculadora.somaArray(number);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
