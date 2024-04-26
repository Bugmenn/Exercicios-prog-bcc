package Unidade5;

import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o número:");
        int numero = s.nextInt();

        System.out.print("Informe a quantidade de linha:");
        int qtLinhas = s.nextInt();

        for (int i = 1; i <= qtLinhas; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print(numero+" ");
                numero++;
            }
            System.out.println("\n");
        }

        s.close();
    }
}
