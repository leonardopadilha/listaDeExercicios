package ExerciciosDojo123.Ex05;

public class CalcularSalario {
    private String nome;
    private int numDependentes;
    private int qtdHorasTrabalhadas;
    private double salarioBruto;

    CalcularSalario(String nome, int numDependentes, int qtdHorasTrabalhadas, double salarioBruto){
        this.nome = nome;
        this.numDependentes = numDependentes;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.salarioBruto = salarioBruto;
    }

    CalcularSalario(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumDependentes() {
        return numDependentes;
    }

    public void setNumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }

    public int getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(int qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public int valorTotalHorasTrabalhadas(){
        return getQtdHorasTrabalhadas() * 12;
    }

    public int calculaValorDependente(){
        return getNumDependentes() * 40;
    }

    public double calculaValorComAdicional(){
        return valorTotalHorasTrabalhadas() + calculaValorDependente() + getSalarioBruto();
    }

    public double calculaInss(){
        return calculaValorComAdicional() * 0.085;
    }

    public double calculaIr(){
        return calculaValorComAdicional() * 0.05;
    }

    public double calculaSalarioLiquido(){
        return calculaValorComAdicional() - (calculaInss() + calculaIr());
    }
}
