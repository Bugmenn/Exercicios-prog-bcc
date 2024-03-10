package aula_1;
import java.util.Scanner; // importa o scanner para utilizar o terminal

public class Exe2 { // classe principal
    public static void main(String[] args) { // main
        Scanner s = new Scanner(System.in); // cria o objeto scanner (sendo "s")
        System.out.print("Escreva o número:");
        int numero = s.nextInt(); // input
        if (numero % 2 == 0) { // codicional if
            System.out.println(numero + " é par!");
        } else { // condicional else
            System.out.println(numero + " é impar!");
        }
    }
}