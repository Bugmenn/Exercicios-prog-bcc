package Unidade5;

import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o valor N:");
        int numero = s.nextInt();

        System.out.print("Informe o valor K:");
        int decremento = s.nextInt();

        System.out.print("Informe o valor M:");
        int tamanhoMochila = s.nextInt();

        String textoDentro = "";
        String textoFora = "";
        int somaDentro = 0;
        int somaFora = 0;

        for (int i = numero; i > 0; i -= decremento) {
            System.out.print(i+", ");
        }


        while (numero > 0) {
            if (tamanhoMochila > 0) {
                textoDentro += String.valueOf(numero)+", ";
                somaDentro += numero;
            } else {
                textoFora += String.valueOf(numero)+", ";
                somaFora += numero;
            }
            tamanhoMochila--;
            numero -= decremento;
        }

        System.out.println("\nDentro:"+textoDentro+"\nFora:"+textoFora+"\nSoma dos elementos dentro:"+somaDentro+
        "\nSoma dos elementos fora:"+somaFora);

        s.close();
    }
}
