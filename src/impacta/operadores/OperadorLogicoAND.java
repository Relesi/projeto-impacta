package impacta.operadores;

public class OperadorLogicoAND {
    public static void main(String[] args) {
      int idade = 29;
      float salario = 3500F;

      boolean maiorQueTrinta = idade >= 30 && salario >=4000;
      boolean menorQueTrinta = idade < 30 && salario >= 3300;

        System.out.println(maiorQueTrinta);
        System.out.println(menorQueTrinta);

    }
}
