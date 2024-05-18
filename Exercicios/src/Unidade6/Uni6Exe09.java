package Unidade6;

import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        new Uni6Exe09();
    }

    public Uni6Exe09() {
        Scanner s = new Scanner(System.in);

        int matriz[][] = new int[30][3];

        Ler(s, matriz);
        Info(matriz);
    }

    private void Ler(Scanner s, int matriz[][]) {
        String pergunstas[] = {"Informe o sexo (1=feminino 2=masculino):", "Informe a nota para o cinema:", "Informe a idade:"};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < pergunstas.length; j++) {
                System.out.print(pergunstas[j]);
                int resposta = s.nextInt();
                matriz[i][j] = resposta;
            }
        }
    }

    private void Info(int matriz[][]) {
        double mediaTotal = 0;
        int qtHomens = 0;
        double mediaHomens = 0;
        int notaMulherJovem = 0;
        int idadeMulher = 999999999;
        int qtMulher = 0;
        for (int i = 0; i < matriz.length; i++) {
            mediaTotal += matriz[i][1];
            if (matriz[i][0] == 2) {
                qtHomens++;
                mediaHomens += matriz[i][1];
            } else if (matriz[i][0] == 1 && idadeMulher > matriz[i][2]) {
                idadeMulher = matriz[i][2];
                notaMulherJovem = matriz[i][1];
            }
        }
        mediaTotal /= 30;
        mediaHomens /= qtHomens;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == 1 && matriz[i][1] > mediaTotal && matriz[i][2] >= 50) {
                qtMulher++;
            }
        }
        System.out.println("Nota média recebida pelo cinema: "+mediaTotal+"\nNota média atribuída pelos homens: "+mediaHomens+
        "\nNota atribuída pela mulher mais jovem: "+notaMulherJovem+"\nQuantas das mulheres com mais de 50 anos deram nota superior a "+
        "média recebida pelo cinema:"+qtMulher);
    }
}
