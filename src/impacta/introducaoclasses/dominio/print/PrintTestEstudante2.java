package impacta.introducaoclasses.dominio.print;

import impacta.introducaoclasses.dominio.Estudante;

public class PrintTestEstudante2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2  = new Estudante();


        estudante.nome = "Maria";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("===============================");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);

        System.out.println("===============================");

        System.out.println(estudante2.idadeProfessor);
        System.out.println(estudante2.nomeProfessor);
        System.out.println(estudante2.sexoProfessor);
    }


}
