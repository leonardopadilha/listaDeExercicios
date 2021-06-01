package ExerciciosDojo123.Ex01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int idadeAnos, idadeMeses, idadeDias;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        idadeAnos = teclado.nextInt();

        System.out.print("Informe quantos meses: ");
        idadeMeses = teclado.nextInt();

        System.out.print("Informe quantos dias: ");
        idadeDias = teclado.nextInt();

        int totalMeses = idadeMeses * 30;
        int totalAnos = idadeAnos * 365;

        int idadeTotal = totalAnos + totalMeses + idadeDias;

        System.out.printf("A quantidade total em dias é: %d", idadeTotal);
    }
}
