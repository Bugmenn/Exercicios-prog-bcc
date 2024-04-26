package Unidade5;

import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o número da sequência:");
        int numero = s.nextInt();

        s.close();

        int numero1 = 8;
        int numero2 = 10;
        int guarda = 0;

        System.out.print(numero1+","+numero2);
        for (int i = 1; i <= (numero-2); i++) {
            if (i%2 != 0) {
                guarda = numero1;
                numero1 *= 2;
                System.out.print(","+numero1);
            } else {
                numero2 = guarda+numero2;
                System.out.print(","+numero2);
            }
        }
    }
}
