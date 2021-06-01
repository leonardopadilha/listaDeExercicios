package ExerciciosDojo123.Ex08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        int numUm, numDois;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        numUm = teclado.nextInt();

        System.out.print("Informe o segundo número: ");
        numDois = teclado.nextInt();

        if(numUm > numDois){
            System.out.print("O maior número é: " + numUm);
        }else {
            System.out.print("O maior número é: " + numDois);
        }
    }
}

