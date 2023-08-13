package impacta.operadores;

public class OperadorTernario {

    public static void main(String[] args) {
        // < > == <= >=

        int idade = 18;
        String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println("A pessoa é: " + status);
    }

}
