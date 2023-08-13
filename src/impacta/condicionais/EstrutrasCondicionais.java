package impacta.condicionais;

public class EstrutrasCondicionais {
    public static void main(String[] args) {

        double salarioAnual = 70000;
        double primeiraFaixa = 9.79 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;

        double imposto;

        if (salarioAnual == 34700) {
            imposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34710 && salarioAnual <= 68000) {
            imposto = salarioAnual * segundaFaixa;
        }else {
            imposto = salarioAnual * terceiraFaixa;
        }

        System.out.println(imposto);


    }
}
