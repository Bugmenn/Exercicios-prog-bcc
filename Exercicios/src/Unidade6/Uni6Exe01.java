package Unidade6;

import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        new Uni6Exe01(); //cria o objeto
    }

    public Uni6Exe01() {
        Scanner s = new Scanner(System.in);
        
        int vetor[] = new int[10];

        //chamada dos metodos
        Ler(s, vetor);
        Escrever(vetor);
    }

    private void Ler(Scanner s, int vetor[]) {
        for (int i = 0; i<vetor.length; i++) {
            System.out.print("Informe o "+(i+1)+"° número:");
            int numero = s.nextInt();
            vetor[i] = numero;
        }
    }

    private void Escrever(int vetor[]) {
        for (int i = vetor.length-1; i>=0; i--) {
            System.out.println(vetor[i]);
        }
    }
}