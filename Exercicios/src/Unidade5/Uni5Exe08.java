package Unidade5;

import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a quantidade de números que deseja escrever:");
        int quantidade = s.nextInt();

        double media = 0;
        int menor = 0;
        int qtPositivos = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Informe o "+i+"° número:");
            int numero = s.nextInt();

            if (numero > 0) {
                media += numero;
                qtPositivos++;
            }
            if (numero < 0 && menor > numero) {
                menor = numero;
            }
        }

        s.close();

        System.out.println("Média:"+(media/qtPositivos)+"\nMenor:"+menor);
    }
}
