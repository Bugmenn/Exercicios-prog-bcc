package aula_1;
import java.util.Scanner; // importa o scanner para utilizar o terminal

public class Exe6 { // classe principal
    public static void main(String[] args) { // main
        Scanner s = new Scanner(System.in); // cria o objeto scanner (sendo "s")
        System.out.print("Escreva o 1° ponto:");
        Integer ponto1 = s.nextInt(); // input
        System.out.print("Escreva o 2° ponto:");
        Integer ponto2 = s.nextInt(); // input
        System.out.print("Escreva o 3° ponto:");
        Integer ponto3 = s.nextInt(); // input
        
        s.close();
        
        if (ponto1 == ponto2 && ponto1 == ponto3 && ponto2 == ponto3) {
            System.out.println("Equilátero");
        } else if (ponto1 == ponto2 || ponto1 == ponto3 || ponto2 == ponto3) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }
    }
}