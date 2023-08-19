package impacta.condicionais.arrays;

public class Arrays_01 {
    public static void main(String[] args) {
        Arrays_01 a = new Arrays_01();
        //a.ArraysPrintAge();
        a.Arrays();
    }

    public void ArraysPrintAge() {
        int idade1 = 15;
        int idade2 = 20;
        int idade3 = 30;

        System.out.println(idade1);
        System.out.println(idade2);
        System.out.println(idade3);
    }

    public void Arrays() {
        int[] idades = new int[3];
        idades[0] = 15;
        idades[1] = 20;
        idades[2] = 30;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

    }
}
