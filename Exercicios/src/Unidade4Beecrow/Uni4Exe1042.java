package Unidade4Beecrow;

import java.util.Arrays;
import java.util.Scanner;

public class Uni4Exe1042 {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numero1 = s.nextInt();
		int numero2 = s.nextInt();
        int numero3 = s.nextInt();
		
		s.close();

        int[] listaNumeros = {numero1, numero2, numero3};
        Arrays.sort(listaNumeros);
        for (int i=0; i<listaNumeros.length; i++)
            System.out.println(listaNumeros[i]);
        System.out.println("\n"+numero1+"\n"+numero2+"\n"+numero3);
    }
}
