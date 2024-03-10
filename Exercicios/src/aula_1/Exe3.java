package aula_1;
import java.util.Scanner; // importa o scanner para utilizar o terminal

public class Exe3 { // classe principal
    public static void main(String[] args) { // main
        Scanner s = new Scanner(System.in); // cria o objeto scanner (sendo "s")
        System.out.print("Escreva a temperatura em Celsius:");
        Float numero = s.nextFloat(); // input
        System.out.println("Em Fahrenheit:" + (numero * 9/5 + 32));
    }
}