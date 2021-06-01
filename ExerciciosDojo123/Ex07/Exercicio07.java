package ExerciciosDojo123.Ex07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        double notaUm = 0, notaDois = 0, notaTres = 0, media;
        int i = 1, count = 1;

        Scanner teclado = new Scanner(System.in);

        while (count <= 3) {
            System.out.printf("Informe a %d nota: ", count);
            if (count == 1) {
                notaUm = teclado.nextDouble();
            } else if (count == 2) {
                notaDois = teclado.nextDouble();
            } else {
                notaTres = teclado.nextDouble();
            }
            count ++;
        }
        media = ((notaUm * 2) + (notaDois * 3) + (notaTres * 5)) / (notaUm + notaDois + notaTres);
        String mediaNotas = (String.format("%.2f", media));
        System.out.print("A média é: " + mediaNotas);
    }
}