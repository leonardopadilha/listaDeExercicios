package ExerciciosDojo123.Ex14;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        int x, y, z;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro lado: ");
        x = teclado.nextInt();

        System.out.print("Informe o segundo lado: ");
        y = teclado.nextInt();

        System.out.print("Informe o último lado: ");
        z = teclado.nextInt();

        if(x!= 0 && y!= 0 && z!= 0){
            if (x!= y && x!= z && y!= z){
                 System.out.print("Triângulo Escaleno");
             }else if(x == y && y == z){
                 System.out.print("Triângulo Equilátero");
             }else{
                 System.out.print("Triângulo Isósceles");
                }
        }else {
            System.out.print("Essa forma não é de um triângulo");
        }
     }
}
