package aula3;

import java.util.Scanner;

public class ifElse {
    static void main() {


        int idada = 18;

        if (idada < 18){
            IO.println("foi barrado na porta");
        }else {
            System.out.println("onde");
            IO.println("liberado");
        }

        Scanner sc = new Scanner(System.in);


        IO.print("Digite sua nota");
        int nota = sc.nextInt();
        if(nota < 3){
            IO.println("Reprovado");
        } else {
            IO.println("reprovado");
        }
        IO.print("Digite sua nota");
        int nota2 = sc.nextInt();
        if (nota2 <= 6){
            IO.println("Recuperação");
        } else {
            IO.println("Aprovado");
        }
        IO.print("Digite sua nota");
        int nota3 = sc.nextInt();
        if (nota3 > 6){
            IO.println("Aprovado");
        } else {
            IO.println("Reprovado");
        }

        double media = (nota + nota2 + nota3) / 3;
        System.out.println("a media e:" + media);





    }
}
