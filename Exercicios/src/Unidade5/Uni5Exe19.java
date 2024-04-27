package Unidade5;

import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double total = 0;

        while (true) {
            System.out.print("Informe o valor da compra:");
            double valor = s.nextDouble();

            if (valor == 0) {
                break;
            }

            if (valor > 500) {
                valor -= valor*0.20;
            } else if (valor <= 500) {
                valor -= valor*0.15;
            }

            total += valor;

            System.out.println("Valor da compra:"+valor);
        }

        System.out.println("Total recebido:"+total);

        s.close();
    }
}
