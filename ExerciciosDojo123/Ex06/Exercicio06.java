package ExerciciosDojo123.Ex06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        double precoFabricaVeiculo, custoConsumidor;
        double percentualLucroDistribuidor, pecentualImposto;
        double valorImposto, percentualLucro;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o preço de fábrica do veículo: ");
        precoFabricaVeiculo = teclado.nextDouble();

        System.out.print("Informe o percentual de lucro do distribuidor: ");
        percentualLucroDistribuidor = teclado.nextDouble();

        System.out.print("Informe o percentual de imposto: ");
        pecentualImposto = teclado.nextDouble();

        valorImposto = precoFabricaVeiculo * (pecentualImposto/100);
        percentualLucro = precoFabricaVeiculo * (percentualLucroDistribuidor/100);
        custoConsumidor = precoFabricaVeiculo + percentualLucro + valorImposto;

        System.out.println("O lucro do distribuidor é: " + percentualLucro);
        System.out.println("Impostos: " + valorImposto);
        System.out.println("Custo final do veículo " + custoConsumidor);
    }
}