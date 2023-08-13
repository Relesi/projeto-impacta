package impacta.operadores;

public class OperadorLogicoOR {
    public static void main(String[] args) {
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 4000;
        float valorPlaystation = 5000F;

        boolean playStation = valorTotalContaCorrente > valorPlaystation && valorTotalContaPoupanca > valorPlaystation;


        System.out.println(playStation);

    }
}
