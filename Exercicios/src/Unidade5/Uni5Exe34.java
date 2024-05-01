package Unidade5;

import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int qtEncerrada = 0;

        do {
            System.out.println("(1) encerrar a conta de um hóspede;\n(2) verificar número de contas encerradas;\n(3) sair.");
            int escolha = s.nextInt();
            
            if (escolha == 1) {
                System.out.print("Informe o nome:");
                String nome = s.next();

                System.out.print("Informe a quantidade de diárias:");
                int qtDiaria = s.nextInt();

                double totalPagar = qtDiaria*50;

                if (qtDiaria < 15) {
                    totalPagar += 7.50*qtDiaria;
                } else if (qtDiaria == 15) {
                    totalPagar += 6.50*qtDiaria;
                } else {
                    totalPagar += 5*qtDiaria;
                }
                System.out.println(nome+": "+totalPagar+" R$");
                qtEncerrada++;
            } else if (escolha == 2) {
                System.out.println("\u001B[31mQuantidade de contas encerradas: "+qtEncerrada+"\u001B[0m");
            } else if (escolha == 3) {
                break;
            }
            
        } while (true);

        s.close();
    }
}
