package Unidade4Beecrow;

import java.util.Scanner;

public class Uni4Exe1035 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numeroA = s.nextInt();
		int numeroB = s.nextInt();
		int numeroC = s.nextInt();
		int numeroD = s.nextInt();
		
		s.close();
		
		if (numeroB>numeroC && numeroD>numeroA && 
		(numeroC+numeroD)>(numeroA+numeroB) && numeroC>0 && numeroD>0 && numeroA%2==0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
	}

}
