package Unidade5;

import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nome = "";
        String texto = "";
        double media = 0;

        while (true) {
            System.out.print("Informe o nome do aluno:");
            nome = s.next();

            if (nome.equals("fim")) {
                break;
            }

            for (int i = 1; i <= 2; i++) {
                System.out.print("Informe a "+i+"° nota:");
                int nota = s.nextInt();
                media += nota;
            }
            media /= 2;
            texto += "Nome:"+nome+" Média:"+media+"\n";
        }
        s.close();

        System.out.println("\n"+texto);
    }
}
