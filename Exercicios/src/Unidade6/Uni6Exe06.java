package Unidade6;

import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        new Uni6Exe06();
    }

    public Uni6Exe06() {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores a serem escritos:");
        int qt = s.nextInt();
        double vetor[] = new double[qt];

        Encontrar(Ler(s, vetor), vetor);
    }

    private double Ler(Scanner s, double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o "+(i+1)+"° número:");
            double numero = s.nextDouble();
            vetor[i] = numero;
        }
        System.out.print("Informe um valor:");
        double valor = s.nextDouble();
        return valor;
    }

    private void Encontrar(double numero, double vetor[]) {
        for (double d : vetor) {
            if (d == numero) {
                System.out.println(true);
                break;
            } else  if (d != numero && vetor[vetor.length-1] == d) {
                System.out.println(false);
            }
        }
    }
}
