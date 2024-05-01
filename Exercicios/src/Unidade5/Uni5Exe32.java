package Unidade5;

import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o dia da semana que cai o primeiro dia:");
        int primeiroDia = s.nextInt();

        System.out.print("Informe quantos dias o mês possue:");
        int qtDias = s.nextInt();

        int contador = 1;
        int diaSemana = 1;

        System.out.println("D\tS\tT\tQ\tQ\tS\tS");

        while (true) {

            // caso o dia da semana seja maior que 7, volta a ser 1
            if (diaSemana > 7) {
                diaSemana = 1;
            }

            if (diaSemana < primeiroDia) {
                if (diaSemana == (primeiroDia-1)) {
                    primeiroDia = -1;
                } else {
                    System.out.print("\t");
                }
                diaSemana++;
                continue;
            } else {
                if (diaSemana == 1 && contador != 1) {
                    System.out.print("\n"+contador);
                } else if (diaSemana > 1) {
                    System.out.print("\t"+contador);
                }
            }

            
            if (contador == qtDias) {
                break;
            }

            contador++;
            diaSemana++;
        }

        s.close();
    }
}
