package Unidade5;

import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int qt20 = 0;
        int qt10 = 0;
        int qt5 = 0;
        int qt2 = 0;
        int qt1 = 0; 

        System.out.print("Informe o valor:");
        int valor = s.nextInt();

        while (valor != 0) {
            if (valor >= 20) {
                valor -= 20;
                qt20++;
            } else if (valor >= 10) {
                valor -= 10;
                qt10++;
            } else if (valor >= 5) {
                valor -= 5;
                qt5++;
            } else if (valor >= 2) {
                valor -= 2;
                qt2++;
            } else {
                valor -= 1;
                qt1++;
            }
        }

        System.out.println("Forneça: cedula 20-"+qt20+", cedula 10-"+qt10+", cedula 5-"+qt5+", cedula 2-"+qt2+", cedula 1-"+qt1);

        s.close();
    }
}
