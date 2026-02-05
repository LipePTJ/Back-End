package aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayExercicio {

    static void main() {



        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        IO.println("digite um numero");
        int num = sc.nextInt();
        numeros.add(num);
        IO.println(numeros);





    }
}

