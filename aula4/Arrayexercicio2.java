package aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrayexercicio2 {

    static void main() {

        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        IO.println("digite um numero");
        numeros.add(sc.nextInt());
        IO.println("digite um numero");
        numeros.add(sc.nextInt());
        int soma = 0;
        for (int num : numeros) {
            soma = num + soma;
        }
        IO.println(soma);













    }
}
