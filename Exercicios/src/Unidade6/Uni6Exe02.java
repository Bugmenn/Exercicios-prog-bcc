package Unidade6;

import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        new Uni6Exe02();
    }

    public Uni6Exe02() {
        Scanner s = new Scanner(System.in);

        double vetor[] = new double[12];

        Ler(s, vetor);
        Escrever(vetor);
    }

    private void Ler(Scanner s, double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o "+(i+1)+"° número:");
            double numero = s.nextInt();
            vetor[i] = numero;
        }
    }

    private double Media(double vetor[]) {
        double media = 0;
        for (int i = 0; i < vetor.length; i++) {
            media += vetor[i];
        }
        media /= vetor.length;
        return media;
    }

    private void Escrever(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= Media(vetor)) {
                System.out.println(vetor[i]);
            }
        }
    }
}
