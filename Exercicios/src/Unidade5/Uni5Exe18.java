package Unidade5;

import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double qt4 = 0;
        double qt5 = 0;
        double qt9 = 0;
        double qt12 = 0;
        double totalPessoas = 0;

        while (true) {
            System.out.print("Informe o número do canal:");
            int canal = s.nextInt();

            if (canal == 0) {
                break;
            }

            System.out.print("Informe a quantidade de pessoas:");
            int qtPessoas = s.nextInt();
            totalPessoas += qtPessoas;

            if (canal == 4) {
                qt4 += qtPessoas;
            } else if (canal == 5) {
                qt5 += qtPessoas;
            } else if (canal == 9) {
                qt9 += qtPessoas;
            } else {
                qt12 += qtPessoas;
            }
        }

        String porcentamgem4 = "\nCanal 4 - "+(int)(qt4/totalPessoas*100)+"%";
        String porcentamgem5 = "\nCanal 5 - "+(int)(qt5/totalPessoas*100)+"%";
        String porcentamgem9 = "\nCanal 9 - "+(int)(qt9/totalPessoas*100)+"%";
        String porcentamgem12 = "\nCanal 12 - "+(int)(qt12/totalPessoas*100)+"%";

        System.out.println("\nPercentual de audiência:"+porcentamgem4+porcentamgem5+porcentamgem9+porcentamgem12);
        s.close();
    }
}
