package Unidade5;

import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o número:");
        int numero = s.nextInt();

        int contador = 0;

        while (true) {
            if (contador < 2) {
                contador++;
                continue;
            }
            
            int qt = 0;

            if (numero % contador == 0) {
                for (int i = 2; i <= contador; i++) {
                    if (contador % i == 0) {
                        qt++;
                    }
                }

                if (qt == 1) {
                    System.out.println("Número:"+numero+" Descomposição:"+contador);
                    break;
                }
            }
            
            contador++;
        }

        s.close();
    }
}
