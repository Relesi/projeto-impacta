package impacta.introducaoclasses.dominio.print;

import impacta.introducaoclasses.dominio.Carro;

public class PrintTestCarro {

    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.nome = "Fusca";
        carro1.modelo = "Volkswagen";
        carro1.cor = "azul";
        carro1.ano = 1970;

        Carro carro2 = new Carro();

        carro1.nome = "BMW";
        carro1.modelo = "Sedan";
        carro1.cor = "Preto";
        carro1.ano = 2023;

        carro2 = carro1;

        System.out.println("Carro1");
        System.out.println("Nome :" + carro1.nome + "\n" + "Modelo "  + carro1.modelo + "\n" + "Cor: " + carro1.cor + "Ano: " + carro1.ano );
        System.out.println("====================================");
        System.out.println("Carro2");
        System.out.println("Nome :" + carro2.nome + "\n" + "Modelo "  + carro2.modelo + "\n" + "Cor: " + carro2.cor + "Ano: " + carro2.ano );
    }





}
