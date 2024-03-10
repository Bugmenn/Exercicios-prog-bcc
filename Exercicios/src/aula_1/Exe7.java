package aula_1;
import java.util.Scanner; // importa o scanner para utilizar o terminal

public class Exe7 { // classe principal
    public static void main(String[] args) { // main
        Scanner s = new Scanner(System.in); // cria o objeto scanner (sendo "s")
        System.out.print("Escreva o peso:");
        Float peso = s.nextFloat(); // input
        System.out.print("Escreva a altura:");
        Float altura = s.nextFloat(); // input
        Float calculo = peso/altura;
        if (calculo >= 18.5 && calculo <= 24.9) {
            System.out.println("Peso normal");
        } else if (calculo < 18.5) {
            System.out.println("Abaixo do peso");           
        } else {
            System.out.println("Acima do peso");
        }
    }
}