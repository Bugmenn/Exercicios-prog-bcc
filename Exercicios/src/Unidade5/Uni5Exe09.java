package Unidade5;

import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos:");
        int quantidade = s.nextInt();

        String nomes = "";
        int qt20 = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Informe o nome do "+i+"° aluno:");
            String nome = s.next();

            System.out.print("Informe a idade "+i+"° aluno:");
            int idade = s.nextInt();

            if (idade == 18) {
                nomes += nome+", ";
            } else if (idade > 20) {
                qt20++;
            }
        }

        s.close();

        System.out.println("\nAlunos que tem 18: "+nomes+"\nQuantidade de alunos que tem idade acima de 20: "+qt20);
    }
}
