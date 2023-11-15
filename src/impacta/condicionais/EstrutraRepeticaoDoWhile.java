package impacta.condicionais;

public class EstrutraRepeticaoDoWhile {


    public static void main(String[] args) {
        // while, do while, for


        int count = 0;
        while (count < 10) {
            System.out.println(++count);
            //count = count + 1;
        }

        count = 0;
        do {
            System.out.println("Dentro do do-while" + ++count);

        } while (count < 10);

        count = 0;

        for (count = 0; count < 0; count++) {
            System.out.println("For " + count);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }

    }
}
