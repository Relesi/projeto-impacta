package impacta.exercicios;


    /*

      Escreva um programa Java para inserir e exibir sua senha.
            Saída Esperada

            Digite sua senha:
            Sua senha era: abc@123
    */

import java.io.Console;


public class Exercicio_15 {

    public static void main(String[] args) {
        //Obtaining a reference to the console.
        Console con;

        // Checking If there is no console available, then exit.
        if ((con = System.console()) != null) {
            char[] password = con.readPassword("Input your password here : ");

            System.out.print("Your password is " + new String(password));
        } else {
            System.out.println("No console Found....");
        }
    }

}
