package ExerciciosDojo123.Ex16;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        int num, maior;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o número desejdo: ");
        num = teclado.nextInt();

        maior = (num > 30 || num > 20 || num > 10) ? (num) : (num * -1);

        System.out.print("O número é: " + maior);
    }
}
