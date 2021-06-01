package ExerciciosDojo123.Ex02;

public class Exercicio02 {
    public static void main(String[] args) {
        double temperaturaF = 20.5;
        double temperaturaC;

        temperaturaC = (temperaturaF - 32) * 5/9;

        System.out.printf(String.format("%.2f", temperaturaC));
    }
}
