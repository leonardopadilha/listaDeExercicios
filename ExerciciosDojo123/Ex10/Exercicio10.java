package ExerciciosDojo123.Ex10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int numInformados, numPar;

        Scanner teclado = new Scanner(System.in);

           System.out.print("Informe a quantidade de números que serão digitados: ");
           numInformados = teclado.nextInt();

           int[] numTotal = new int[numInformados];
           for(int numeros : numTotal){
               System.out.printf("Digite o número desejado: ");
               numPar = teclado.nextInt();
               if (numPar % 2 == 0){
                   System.out.printf("O número %d é par \n", numPar);
               }else {
                   System.out.printf("O número %d é ímpar \n", numPar);
               }
           }
   }
}
