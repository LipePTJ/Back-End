package aula4;

public class While {

    static void main() {

        int i = 10;
        while (i < 11) {
            IO.println("o que vai acontecer?");
            i++;

// mostrar todos os numeros pares de 1 a 10
// mostrar todos os numeros impares de 1 ate 10


            int a = 1;
            while (a <= 10) {
                if (a % 2 == 0) {
                    System.out.println("Numero par: " + a);
                }
                a++;
            }

            int b = 1;
            while (b <= 10) {
                if (b % 2 != 0) {
                    System.out.println("Numero impar: " + b);
                }
                b++;
            }

        }
    }

}