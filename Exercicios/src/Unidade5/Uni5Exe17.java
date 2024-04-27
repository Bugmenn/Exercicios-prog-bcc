package Unidade5;

import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String textoMaior = "";
        double maior = 0;
        String textoeMenor = "";
        double menor = 0;

        int contador = 0;

        while (true) {
            System.out.print("Informe o número de inscrição:");
            int numeroInscricao = s.nextInt();
            
            if (numeroInscricao == 0) {
                break;
            }

            System.out.print("Informe a altura:");
            double altura = s.nextDouble();

            if (contador == 0) {
                maior = altura;
                textoMaior = "Número de inscrição:"+numeroInscricao+"\nAltura:"+maior;
                menor = altura;
                textoeMenor = "Número de inscrição:"+numeroInscricao+"\nAltura:"+menor;
                contador++;
            }
            
            if (maior < altura) {
                maior = altura;
                textoMaior = "Número de inscrição:"+numeroInscricao+"\nAltura:"+maior;
            }
            if (menor > altura) {
                menor = altura;
                textoeMenor = "Número de inscrição:"+numeroInscricao+"\nAltura:"+menor;
            }

        }

        System.out.println("\nMaior atleta\n"+textoMaior+"\n\nMenor atleta\n"+textoeMenor);
        s.close();
    }
}
