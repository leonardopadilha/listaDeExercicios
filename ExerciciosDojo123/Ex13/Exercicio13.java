package ExerciciosDojo123.Ex13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        double valorProduto;
        int qtdItensVendidos;
        double totalPagamento;
        double valorTotalVendas;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        valorProduto = teclado.nextDouble();

        System.out.print("Informe a quantidade de itens vendidos: ");
        qtdItensVendidos = teclado.nextInt();

        valorTotalVendas = valorProduto * qtdItensVendidos;
        totalPagamento = (valorTotalVendas * 0.09) + 200;

        System.out.print("Total a receber: R$ " + totalPagamento);
    }
}
