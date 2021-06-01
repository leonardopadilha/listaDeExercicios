package ExerciciosDojo123.Ex09;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        double valorVenda;
        double salarioTotalFuncionario;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor da venda: ");
        valorVenda = teclado.nextDouble();

        salarioTotalFuncionario = 800.00 + (valorVenda * 0.15);

        System.out.print("Valor da venda: R$ " + String.format("%.2f", valorVenda) + "\n" +
                           "Comissão: R$ " + String.format("%.2f", valorVenda * 0.15) + "\n" +
                           "Pagamento total (Comissão + Salário): R$ " + String.format("%.2f", salarioTotalFuncionario));
    }
}
