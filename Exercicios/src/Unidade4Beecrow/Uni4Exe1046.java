package Unidade4Beecrow;

import java.util.Scanner;

public class Uni4Exe1046 {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int inicio = s.nextInt();
		int fim = s.nextInt();
		
		s.close();

        int duracao = 0;
        
        if (inicio<fim) {
            duracao = fim-inicio;
        } else if (inicio==fim) {
            duracao = 24;
        } else if (inicio>fim) {
            for (int i=0; i<=24; i++) {
                if (inicio==24) {
                    inicio = 0;
                }
                if (inicio==fim) {
                    duracao = i;
                    break;
                }
                inicio++;
            }    
        }



        System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
    }
}