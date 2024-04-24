package Unidade5;

public class Uni5Exe04 {
    public static void main(String[] args) {

        double soma = 0;
        double numerador = 3;
        double denominador = 2;
        int guarda = 4;

        for (int i = 1; i<=20; i++) {
            soma += numerador/denominador;

            numerador += 2;
            denominador += guarda;
            guarda += 2;
        }

        System.out.println("S:"+soma);
    }
}
