package ExerciciosDojo123.Ex12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        int numConta;
        int saldoInicioMes;
        int totalItensCobradosMes;
        int totalCreditosAplicadosMes;
        int limiteCreditoAutorizado;
        int limiteCredito;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o número da conta: ");
        numConta = teclado.nextInt();

        System.out.print("Informe o saldo: ");
        saldoInicioMes = teclado.nextInt();

        System.out.print("Informe o total dos itens cobrados: ");
        totalItensCobradosMes = teclado.nextInt();

        System.out.print("Informe o total de Créditos aplicados: ");
        totalCreditosAplicadosMes = teclado.nextInt();

        System.out.print("Informe o total de Créditos autorizado: ");
        limiteCreditoAutorizado = teclado.nextInt();

        limiteCredito = saldoInicioMes + totalItensCobradosMes - totalCreditosAplicadosMes;

        if(limiteCredito > limiteCreditoAutorizado) {
            System.out.printf("O novo saldo é %d - Limite excedido", limiteCredito);
        }else {
            System.out.printf("O novo saldo é %d - Limite permitido", limiteCredito);
        }
    }
}
