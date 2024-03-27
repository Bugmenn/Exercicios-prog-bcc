package aula_3;

public class Exe5 {
	String nome;
	float preco;
	int quantidade;
	
	int adicionar(int numero) {
		return quantidade += numero;
	}
	
	int remover(int numero) {
		if (quantidade >= numero) {
			return quantidade -= numero;	
		} else {
			return quantidade;
		}
	}
	
	float calcularEstoque() {
		return preco * quantidade;
	}
}