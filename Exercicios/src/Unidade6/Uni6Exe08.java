package Unidade6;

import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        new Uni6Exe08();
    }

    public Uni6Exe08() {
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
        double vetor[] = new double[qt];

        Ler(s, vetor);
        Tabela(vetor);
    }

    private void Ler(Scanner s, double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe um número:");
            double numero = s.nextDouble();
            vetor[i] = numero;
        }
    }

    private void Tabela(double vetor[]) {
        String texto = "";
        System.out.println("Valor\t|    Frequência");
        for (int i = 0; i < vetor.length; i++) {
            int qtAparece = 0;
            if (texto.contains(Double.toString(vetor[i]))) {
                continue;
            }
            for (double d : vetor) {
                if (vetor[i] == d) {
                    qtAparece++;
                }
            }
            texto += vetor[i]+"\t|\t"+qtAparece+"\n";
        }
        System.out.println(texto);
    }
}
