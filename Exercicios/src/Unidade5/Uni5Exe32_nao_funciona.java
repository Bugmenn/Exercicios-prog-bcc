package Unidade5;

import java.util.Scanner;

public class Uni5Exe32_nao_funciona {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o dia da semana que cai o primeiro dia:");
        int primeiroDia = s.nextInt();

        System.out.print("Informe quantos dias o mês possue:");
        int qtDias = s.nextInt();

        int contador = 1;
        int diaSemana = 1;

        System.out.println("D   S   T   Q   Q   S   S");

        while (true) {

            if (diaSemana > 7) {
                diaSemana = 1;
            }

            if (diaSemana < primeiroDia) {
                System.out.print("   ");
                diaSemana++;
                continue;
            } else {
                if (diaSemana == 1 && contador != 1) {
                    System.out.println("f   "+contador);
                } else if (diaSemana > 1) {
                    System.out.print("   "+contador+diaSemana);
                }
            }

            
            if (contador == qtDias) {
                break;
            }

            contador++;
            diaSemana++;
            if (diaSemana == primeiroDia) {
                primeiroDia = -1;
            }
        }

        s.close();
    }
}
