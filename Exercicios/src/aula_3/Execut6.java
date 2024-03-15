package aula_3;

import java.util.Scanner;

public class Execut6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Exe6 carro = new Exe6();
		
		System.out.print("Escreva o modelo:");
		carro.modelo = s.nextLine();

		System.out.print("Escreva a capacidade do tanque de combustivel:");
		carro.capacidade_tanque = s.nextFloat();

		System.out.print("Informe a quilometragem rodada na ultima viagem:");
		carro.quilometragem_rodada = s.nextFloat();

		s.close();

        System.out.print("A média de consumo do veículo é:"+carro.calcularMediaCosumo()+"km/l");
	}

}