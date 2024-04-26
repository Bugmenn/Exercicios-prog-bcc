package Unidade5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double soma = 0;

        for (int i = 1; i <= 2; i++) {
            System.out.print("Informe a altura:");
            double altura = s.nextDouble();
            soma += altura;
        }

        s.close();

        DecimalFormat formatado = new DecimalFormat("0.00");
        String media = formatado.format(soma/2);
        System.out.println("Média: "+media);
    }
}
