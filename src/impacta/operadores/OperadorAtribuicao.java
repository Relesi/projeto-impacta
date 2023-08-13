package impacta.operadores;

public class OperadorAtribuicao {
    public static void main(String[] args) {
        //Atribuição

        // = += -= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        //bonus = 2000;

        //System.out.println(bonus);

        int x = 5;
        int y = 10;

        x += 3;
        y -= 5;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}


