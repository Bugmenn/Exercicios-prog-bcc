package Unidade5;

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o limite:");
        double limite = s.nextDouble();

        double total = 0;

        while (true) {

            System.out.print("Informe o peso do peixe:");
            double peso = s.nextDouble();
            peso /= 1000;
            total += peso;

            if (total > limite) {
                System.out.println("Limite excedido!!!");
                break;
            }

            System.out.println("Total até o momento:"+total);

            System.out.println("deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
            char escolha = s.next().charAt(0);

            if (escolha == 'n') {
                break;
            }
        }

        s.close();
    }
}
