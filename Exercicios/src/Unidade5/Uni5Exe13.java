package Unidade5;

import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de reabastecimentos:");
        int qt = s.nextInt();

        String texto = "";
        double guarda = 0;
        double somaCombustivel = 0;
        double hodometroFinal = 0;

        for (int i = 0; i < qt; i++) {
            System.out.print("Quantidade de combustivel comprado:");
            double combustivel = s.nextDouble();

            System.out.print("Valor hodômetro:");
            double hodometro = s.nextDouble();

            hodometroFinal = hodometro;

            hodometro -= guarda;
            guarda = hodometro;

            texto += hodometro/combustivel+", ";

            somaCombustivel += combustivel;            
        }

        System.out.println("Quilometragem obtida por litro de combustível em cada parada:"+texto);
        System.out.println("Quilometragem média obtida por litro de combustível em toda a viagem:"+(hodometroFinal/somaCombustivel));

        s.close();
    }
}
