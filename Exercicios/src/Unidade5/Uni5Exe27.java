package Unidade5;

import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double pagar = 0;
        int maior = 0;
        int maiorQt = 0;
        String texto = "";

        while (true) {
            System.out.print("Informe um dia:");
            int dia = s.nextInt();

            if (dia < 1 || dia > 30) {
                System.out.println("Dia inválido");
                continue;
            }

            System.out.print("Informe o total de peças produzidas pela manhã:");
            int qtManha = s.nextInt();

            System.out.print("Informe o total de peças produzidas pela tarde:");
            int qtTarde = s.nextInt();

            if (dia >= 1 && dia <=15) {
                if (qtManha+qtTarde > 100 && qtManha >= 30 && qtTarde >= 30) {
                    pagar = (qtManha+qtTarde)*0.80;
                } else {
                    pagar = (qtManha+qtTarde)*0.50;
                }
            } else {
                pagar = (qtManha*0.40)+(qtTarde*0.30);
            }

            if (maiorQt < qtManha+qtTarde) {
                maior = dia;
                maiorQt = qtManha+qtTarde;
            }

            System.out.println();

            if (qtManha > qtTarde) {
                texto = "produz mais no período da manhã";
            } else {
                texto = "produz mais no período da tarde";
            }

            System.out.println("R$ "+pagar+" (valor recebido), dia de maior produção:"+maior+", "+texto);

            System.out.println("Novo funcionário (1.sim 2.não)?");
            int escolha = s.nextInt();

            if (escolha == 2) {
                break;
            }
        }

        s.close();
    }
}
