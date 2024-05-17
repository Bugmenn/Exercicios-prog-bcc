package Unidade6;

import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {
        new Uni6Exe07();
    }

    public Uni6Exe07() {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a quantidade:");
        int qt = s.nextInt();
        if (qt > 20) {
            while (true) {
                System.out.print("Informe a quantidade:");
                qt = s.nextInt();
                if (qt <= 20) {
                    break;
                }
            }    
        }
        int vetor[] = new int[qt];

        Ler(s, vetor);
        Ordenar(vetor);
        Escrever(vetor);
    }

    private void Ler(Scanner s, int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            boolean contem = false;
            System.out.print("Informe um número:");
            int numero = s.nextInt();
            for (int j : vetor) {
                if (numero == j) {
                    contem = true;
                }
            }
            if (contem == false) {
                vetor[i] = numero;
            } else {
                System.out.println("O número já existe!");
                i--;
            }
        }
    }

    private void Ordenar(int vetor[]) {
        for (int i = 0; i < vetor.length-1;) {
            if (vetor[i] > vetor[i+1]) {
                int temp = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = temp;
                i = 0;
            } else {
                i++;
            }
        }
    }

    private void Escrever(int vetor[]) {
        for (int i : vetor) {
            System.out.println(i);
        }
    }
}
