package Unidade6;

import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {
        new Uni6Exe04();
    }

    public Uni6Exe04() {
        Scanner s = new Scanner(System.in);

        int vetor1[] = new int[10];
        int vetor2[] = new int[10];

        Ler(s, vetor1, vetor2);
        Escrever(Somar(vetor1, vetor2));
    }

    private void Ler(Scanner s, int vetor1[], int vetor2[]) {
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Informe o "+(i+1)+"° número do vetor 1:");
            int numero = s.nextInt();
            vetor1[i] = numero;
        }

        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Informe o "+(i+1)+"° número do vetor 2:");
            int numero = s.nextInt();
            vetor2[i] = numero;
        }
    }

    private int[] Somar(int vetor1[], int vetor2[]) {
        int vetor3[] = new int[10];

        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor1[i]+vetor2[i];
        }

        return vetor3;
    }

    private void Escrever(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
