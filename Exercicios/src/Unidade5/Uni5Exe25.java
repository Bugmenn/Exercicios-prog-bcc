package Unidade5;

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int pontosD = 0;
        int pontosE = 0;

        while (true) {
            System.out.print("Informe o lado que fez ponto:");
            char lado = s.next().charAt(0);
            lado = Character.toUpperCase(lado);

            if (lado == 'D') {
                pontosD++;
            } else if (lado == 'E') {
                pontosE++;
            }

            System.out.println("E:"+pontosE+" | "+"D:"+pontosD);

            if ((pontosD >= 21 || pontosE >= 21) && (pontosD-pontosE >= 2 || pontosE-pontosD >= 2)) {
                System.out.println("Fim de jogo!!!");
                if (pontosD-pontosE >= 2) {
                    System.out.println("Lado D ganhou!");
                } else {
                    System.out.println("Lado E ganhou!");
                }
                break;
            }
        }

        s.close();
    }
}
