package Unidade5;

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int qtPessoas = 0;
        int qtMulher = 0;
        double mediaMulher = 0;
        double media = 0;

        while (true) {
            System.out.print("Informe a altura:");
            double altura = s.nextDouble();
            
            if (altura == 0) {
                break;
            }

            System.out.print("Informe o gênero:");
            char genero = s.next().charAt(0);
            genero = Character.toLowerCase(genero);

            qtPessoas++;
            media += altura;
            if (genero == 'f') {
                mediaMulher += altura;
                qtMulher++;
            }
        }

        media /= qtPessoas;
        mediaMulher /= qtMulher;

        System.out.println("\nMédia altura mulheres:"+mediaMulher+"\nMédia altura grupo:"+media);

        s.close();
    }
}
