package impacta.introducaoclasses.dominio.print;

import impacta.introducaoclasses.dominio.Estudante;

public class PrintTestEstudante1 {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Ruan";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println(estudante);
    }
}
