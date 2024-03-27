package aula_3;

public class Exe4 {
	int numeroConta;
	float saldo;
	
	float depositar(float numero) {
		return saldo += numero;
	}
	
	float sacar(float numero) {
		return saldo -= numero;
	}
}