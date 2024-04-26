package Unidade5;

import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a quantidade de números que deseja escrever:");
        int quantidade = s.nextInt();

        System.out.print("Informe o 1° número:");
        double numero1 = s.nextDouble();

        double maior = numero1;
        double menor = numero1;

        for (int i = 2; i <= quantidade; i++) {
            System.out.print("Informe o "+i+"° número:");
            double numero = s.nextDouble();

            if (maior < numero) {
                maior = numero;
            }
            if (menor > numero) {
                menor = numero;
            }
        }

        s.close();

        System.out.println("Maior:"+maior+"\nMenor:"+menor);
    }
}
