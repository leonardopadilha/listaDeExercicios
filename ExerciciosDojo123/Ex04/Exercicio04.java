package ExerciciosDojo123.Ex04;

public class Exercicio04 {
    public static void main(String[] args) {
        double valorMercadoria = 902.50;
        double valorDividido;
        double ValorPrimeiraParcela;

        valorDividido = (int) valorMercadoria / 3;
        valorMercadoria -= valorDividido;
        ValorPrimeiraParcela = valorMercadoria - valorDividido;

        System.out.println("Valor da entrada: " + ValorPrimeiraParcela);
        System.out.println("Valor da parcela 2x de " + valorDividido);
    }
}
