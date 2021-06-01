package ExerciciosDojo123.Ex03;

public class Exercicio03 {
    public static void main(String[] args) {
       double largura = 10;
       double comprimento = 50;
       int potencialampada = 12;
       int qtdLampadaNecessaria;
       int wattsLampada = 18;
       double area;

       area = largura * comprimento;

       qtdLampadaNecessaria = (int) ((wattsLampada / potencialampada) * area);

        System.out.println("Área total: " + area +" m2");
        System.out.println("Serão necessárias: " + qtdLampadaNecessaria + " lâmpadas");
    }
}