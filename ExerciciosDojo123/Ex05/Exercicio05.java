package ExerciciosDojo123.Ex05;

public class Exercicio05 {
    public static void main(String[] args) {
        CalcularSalario calculaSalario = new CalcularSalario();

        calculaSalario.setNome("Alberto");
        calculaSalario.setNumDependentes(2);
        calculaSalario.setSalarioBruto(1500.00);
        calculaSalario.setQtdHorasTrabalhadas(50);

        System.out.println("Funcionario: " + calculaSalario.getNome()                   + "\n" +
                "Número de dependentes: "  + calculaSalario.getNumDependentes()         + "\n" +
                "Salário Bruto: "          + calculaSalario.getSalarioBruto()           + "\n" +
                "Salário com benefícios: " + calculaSalario.calculaValorComAdicional()  + "\n" +
                "Valor INSS: "             + calculaSalario.calculaInss()               + "\n" +
                "Valor IR: "               + calculaSalario.calculaIr()                 + "\n" +
                "Salário Líquido: "        + calculaSalario.calculaSalarioLiquido());
    }
}
