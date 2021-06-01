package ExerciciosDojo123.Ex15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        double metrosQuadrados;
        double areaConstruida;
        double valorPagoImposto;
        double areaNaoConstruida;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o tamanho em m2: ");
        metrosQuadrados = teclado.nextDouble();

        System.out.print("Informe quantos metros m2 construídos: ");
        areaConstruida = teclado.nextDouble();

        areaNaoConstruida = metrosQuadrados - areaConstruida;
        valorPagoImposto = (areaConstruida * 5) + (areaNaoConstruida * 3.80);

        System.out.printf("Valor de imposto a pagar: R$ "+ (String.format("%.2f", valorPagoImposto)));
    }
}
