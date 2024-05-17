package Unidade6;

import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) {
        new Uni6Exe03();
    }

    public Uni6Exe03() {
        Scanner s = new Scanner(System.in);

        double vetor[] = new double[12];

        Ler(s, vetor);
        Aumentar(vetor);
        Escrever(vetor);
    }

    private void Ler(Scanner s, double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o "+(i+1)+"° número:");
            double numero = s.nextInt();
            vetor[i] = numero;
        }
    }

    private void Aumentar(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            if (i%2 != 0) {
                vetor[i] += vetor[i]*0.05; 
            } else {
                vetor[i] += vetor[i]*0.02;
            }
        }
    }

    private void Escrever(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
