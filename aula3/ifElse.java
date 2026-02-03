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
        int nota1 = sc.nextInt();

        IO.print("Digite sua nota");
        int nota2 = sc.nextInt();

        IO.print("Digite sua nota");
        int nota3 = sc.nextInt();

        double media =(nota1 + nota2 + nota3) / 3;
        System.out.println("A média aritmética é:" +media);
        if (media < 4){
            IO.println("Reprovado");
        }
        else if (media <= 6) {
            IO.println("Recuperação");
        } else {
            IO.println("Aprovado");
        }















    }
}
