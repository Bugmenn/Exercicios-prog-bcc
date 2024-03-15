package aula_1;
import java.util.Scanner; // importa o scanner para utilizar o terminal

public class Exe8 { // classe principal
    public static void main(String[] args) { // main
        Scanner s = new Scanner(System.in); // cria o objeto scanner (sendo "s")
        System.out.print("Escreva o valor:");
        Float valor = s.nextFloat(); // input
        
        s.close();
        
        if (valor > 100) {
            System.out.println("Possui 10% de desconto");
            System.out.println("Fica de R$" + valor + " para R$" + (valor - (valor*0.1)));
        }
        else {
            System.out.println("Não possui desconto");
            System.out.println("Fica R$" + valor);
        }
    }
}