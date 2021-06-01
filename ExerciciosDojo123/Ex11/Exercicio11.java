package ExerciciosDojo123.Ex11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int tempoDeCasa;
        double salarioFuncionario, novoSalario;
        String nomeFuncionario;

        Scanner teclado = new Scanner(System.in);

            System.out.print("Informe o nome do colaborador: ");
            nomeFuncionario = teclado.nextLine();

            System.out.print("Informe o salário: ");
            salarioFuncionario = teclado.nextDouble();

            System.out.print("Informe quantos anos o trabalhador possui na empresa: ");
            tempoDeCasa = teclado.nextInt();

            if (tempoDeCasa >= 5){
                novoSalario = salarioFuncionario + (salarioFuncionario * 0.20);
            }else{
                novoSalario = salarioFuncionario + (salarioFuncionario * 0.10);
            }

            System.out.println("O novo salário do funcionário " + nomeFuncionario +
                                "será: R$ " + String.format("%.2f", novoSalario));
    }
}
