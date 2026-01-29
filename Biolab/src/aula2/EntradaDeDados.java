package aula2;

import java.util.Scanner;

public class EntradaDeDados {


    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("digite seu nome");
        String nome = sc.next();
        IO.println("digite sua idade");
        int idade = sc.nextInt();
        IO.println("digite sua altura");
        double altura = sc.nextDouble();
        IO.println("digite seu peso");
        double peso = sc.nextDouble();

        IO.println(nome);
        IO.println(idade);
        IO.println(altura);
        IO.println(peso);

       IO.println("seu imc e:");
       double imc = peso / (altura * altura);

       System.out.println(imc);


    }


}
