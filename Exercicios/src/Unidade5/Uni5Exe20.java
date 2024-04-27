package Unidade5;

import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Informe a massa:");
        double massaInicial = s.nextDouble();

        double massaFinal = massaInicial;
        int tempo = 0;

        while (massaFinal > 0.5) {
            massaFinal /= 2;
            tempo += 50;
        }

        System.out.println("Massa inicial:"+massaInicial+"\nMassa final:"+massaFinal+"\nTempo:"+tempo+" segundos");

        s.close();
    }
}
