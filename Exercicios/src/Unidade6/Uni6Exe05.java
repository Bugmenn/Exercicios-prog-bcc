package Unidade6;

import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        new Uni6Exe05();
    }

    public Uni6Exe05() {
        Scanner s = new Scanner(System.in);

        String vetorHomem[] = new String[5];
        String vetorMulher[] = new String[5];
        String perguntas[] = {"Gosta de música sertaneja?","Gosta de futebol?","Gosta de seriados?",
            "Gosta de redes sociais?","Gosta da Oktoberfest?"};

        Ler(s, vetorHomem, perguntas, "Homem");
        Ler(s, vetorMulher, perguntas, "Mulher");
        Afinidade(vetorHomem, vetorMulher);
    }

    private void Ler(Scanner s, String vetor[], String perguntas[], String sexo) {
        System.out.println(sexo);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(perguntas[i]);
            String resposta = s.next();
            vetor[i] = resposta.toUpperCase();
        }
    }

    private void Afinidade(String vetorHomem[], String vetorMulher[]) {
        int total = 0;
        for (int i = 0; i < vetorMulher.length; i++) {
            if (vetorHomem[i].equals(vetorMulher[i])) {
                total += 3;
                System.out.println(3);
            } else if (vetorHomem[i].equals("IND") || vetorMulher[i].equals("IND")) {
                total += 1;
                System.out.println(1);
            } else {
                total -= 2;
                System.out.println(-2);
            }
        }
        if (total == 15) {
            System.out.println("Casem!");
        } else if (total >= 10 && total <= 14) {
            System.out.println("Vocês tem muita coisa em comum!");
        } else if (total >= 5 && total <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (total >= 0 && total <= 4) {
            System.out.println("Vale um encontro");
        } else if (total >= -9 && total <= -1) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }
    }
}
