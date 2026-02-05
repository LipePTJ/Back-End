package aula4;

public class For {

    static void main() {




        // mostrar todos os numeros pares 1 a 10
        for (int a = 0; a <= 10; a++) {
            IO.println("O valor de A é: " + a++);

        }
        // mostrar todos os numeros impáres de 1 a 10
        for (int b = 1; b <= 10; b++) {
            if (b % 2 != 0) {
                IO.println("O valor de B é: " + b++);
            }
        }
    }
}






