package Unidade5;

import java.util.Scanner;

public class Uni5exe23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double salario = 0;
        double totalVendas = 0;
        String texto = "";

        while (true) {
            System.out.print("Informe o nome:");
            String nome = s.next();

            System.out.print("Informe a variedade de produtos:");
            int variedadeProduto = s.nextInt();

            for (int i = 0; i < variedadeProduto; i++) {
                System.out.print("Informe a quantidade vendida:");
                int qtVendidade = s.nextInt();

                System.out.print("Informe o preço unitário:");
                double preco = s.nextDouble();

                totalVendas += qtVendidade*preco;
                salario += qtVendidade*0.3;
            }

            texto += "\nNome:"+nome+", Total de vendas:"+totalVendas+" R$, Salário:"+salario+" R$, Número de produtos:"+variedadeProduto;

            System.out.println("deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
            char escolha = s.next().charAt(0);

            if (escolha == 'n') {
                break;
            }
        }

        System.out.println(texto);

        s.close();
    }
}
