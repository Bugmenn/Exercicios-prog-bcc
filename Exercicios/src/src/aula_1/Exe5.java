package aula_1;
import java.util.Scanner; // importa o scanner para utilizar o terminal

public class Exe5 { // classe principal
    public static void main(String[] args) { // main
        Scanner s = new Scanner(System.in); // cria o objeto scanner (sendo "s")
        Double notas = 0.0;
        for (int i = 1; i <= 3; i++) { // loop for
            System.out.print("Escreva a " + i + "° nota:");
            notas += s.nextDouble();
        }
        
        s.close();
        
        Double media = notas/3;
        System.out.println("\nMédia:"+media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}