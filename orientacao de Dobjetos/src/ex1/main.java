package ex1;

import java.util.Scanner;

public class main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("digite o nome do cachorro");
        String nome = sc.next();
        IO.println("digite o idade do cachorro");
        int Idade = sc.nextInt();
        IO.println("digite o sexo do cachorro");
        String sexo = sc.next();
        IO.println("digite o raça do cachorro");
        String raca = sc.next();

        Cachorro cachorro = new  Cachorro(nome, Idade, sexo, raca);
        IO.println(cachorro);



        Scanner gatp = new Scanner(System.in);
        IO.println("digite o nome do gato");
        String nomee = sc.next();
        IO.println("digite o idade do gato");
        int Idadee = sc.nextInt();
        IO.println("digite o sexo do gato");
        String sexoo = sc.next();
        IO.println("digite o raça do gato");
        String racaa = sc.next();

        Gato gato = new Gato(nomee, Idadee, sexoo, racaa);
        IO.println(gato);







    }
}
