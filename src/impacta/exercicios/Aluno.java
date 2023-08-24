package impacta.exercicios;


    /*

      Crie uma classe chamada Aluno, que possui um nome e uma nota.
      Será necessário ler o nome e a nota do aluno através da entrada do teclado.
      Em seguida, você criará um objeto Aluno com os dados informados.
      O programa verificará a nota do aluno e imprimirá se ele foi aprovado (nota maior ou igual a 7.0)
      ou reprovado (nota menor que 7.0).

    */

// Nesse exemplo coloquei o main dentro da clase Aluno para otimizar, porém, eu sugiro criarem
// em classes e pacotes segregados


import java.util.Scanner;

public class Aluno {


    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public boolean estaAprovado() {
        return nota >= 7.0;
    }

    public String getNome() {
        return nome;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota);

        if (aluno.estaAprovado()) {
            System.out.println(aluno.getNome() + " foi aprovado!");
        } else {
            System.out.println(aluno.getNome() + " foi reprovado.");
        }

        scanner.close();
    }
}








