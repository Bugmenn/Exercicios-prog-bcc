package aula_1;
import java.util.Scanner; // importa o scanner para utilizar o terminal

public class Exe4 { // classe principal
    public static void main(String[] args) { // main
        Scanner s = new Scanner(System.in); // cria o objeto scanner (sendo "s")
        System.out.print("Escreva a idade:");
        int idade = s.nextInt(); // input
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}