package impacta.exercicios;


    /*

        Escreva um programa Java para criar e exibir um número único de três dígitos usando 1, 2, 3, 4.
          Conte também quantos números de três dígitos existem.
          Saída Esperada

                123
                124
                ...

                431
                432
                O número total do número de três dígitos é 24

    */

        // Nesse exemplo coloquei o main dentro da clase Funcionario para otimizar, porém, eu sugiro criarem
        // em classes e pacotes segregados



public class Funcionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Renato");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprime();

        System.out.println("Média " + funcionario.getMedia());

    }

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            System.out.println("Salario: " + salario + " ");
        }

        imprimeMediaSalarial();

    }

    public void imprimeMediaSalarial() {
        if (salarios == null) {
            return;
        }


        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMedia Salarial " + media);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    //Removendo setMedia ela não pode mais ser alterada, automaticamente ela sera calculada automaticamente
    public void setMedia(double media) {
        this.media = media;
    }



}
