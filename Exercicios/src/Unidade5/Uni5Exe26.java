package Unidade5;

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o limite de pedágio:");
        double limite = s.nextDouble();

        int qtAcima = 0;
        int qtTotal = 0;
        int qt150 = 0;

        while (true) {
            System.out.print("Informe o valor do pedágio e a distância:");
            double valor = s.nextDouble();

            if (valor < 0) {
                break;
            }

            int distância = s.nextInt();

            if (valor > limite) {
                qtAcima++;
            } else if (distância > 150 && valor <= limite) {
                qt150++;
            }
            qtTotal++;
        }

        System.out.println(qtAcima+" (trechos com valor acima do qual ele nega-se a pagar);\n"+qtTotal+" (quantidade de trechos informados);\n"+
        qt150+" (trechos acima de 150km com valor aceito por ele)");

        s.close();
    }
}
