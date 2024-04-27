package Unidade5;

import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double valorPcTotal = 0;
        double valorPvTotal = 0;
        double lucroTotal = 0;

        int qt10 = 0;
        int qt1020 = 0;
        int qt20 = 0;

        for (int i = 0; i < 2; i++) {
            System.out.print("Informe o PC:");
            double valoPc = s.nextDouble();

            System.out.print("Informe o PV:");
            double valorPv = s.nextDouble();

            double lucro = (valorPv-valoPc) / valoPc * 10;
            
            lucroTotal += lucro;
            valorPcTotal += valoPc;
            valorPvTotal += valorPv;

            if (lucro < 10) {
                qt10++;
            } else if (10 < lucro && lucro < 20) {
                qt1020++;
            } else {
                qt20++;
            }
        }

        s.close();
        
        System.out.println("Quantidade abaico de 10%:"+qt10+"\nQuantidade acima de 10% mas abaixo de 20%:"+qt1020+
        "\nQuantidade acima de 20%:"+qt20);
        System.out.println("Valor de PC total:"+valorPcTotal+"\nValor de PV total:"+valorPvTotal+"\nLucro total:"+lucroTotal);
    }
}
