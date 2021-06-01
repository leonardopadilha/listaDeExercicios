package ExerciciosDojo123.Ex17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        int a = 0,b = 0,c = 0, i = 1;

        Scanner teclado = new Scanner(System.in);

        for(i = 1; i <= 2; i++) {
            System.out.print("Digite o " + i + "º número: ");
           c = (i == 1) ? (a = teclado.nextInt()) : (b = teclado.nextInt());
            }

        c = a;
        a = b;
        b = a;

        System.out.println("1º número digitado foi " + b);
        System.out.println("2º número digitado foi " + c);
    }
}
