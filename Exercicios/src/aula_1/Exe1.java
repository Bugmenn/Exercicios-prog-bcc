package aula_1;
import java.util.Scanner; // importa o scanner para utilizar o terminal
import java.util.ArrayList; // importa a classe ArrayList

public class Exe1 { // classe principal
    public static void main(String[] args) { // main
        Scanner s = new Scanner(System.in); // cria o objeto scanner (sendo "s")
        ArrayList<Float> numeros = new ArrayList<Float>(); // cria objeto ArrayList
        for (int i = 1; i <= 2; i++) { // loop for
            System.out.print("Escreva o " + i + "° número:");
            Float numero = s.nextFloat(); // input
            numeros.add(numero); // adiciona o valor na lista
        }

        s.close();
        
        System.out.println("Adição:" + (numeros.get(0) + numeros.get(1))); // output
        System.out.println("Subtração:" + (numeros.get(0) - numeros.get(1)));
        System.out.println("Multiplicação:" + (numeros.get(0) * numeros.get(1)));
        System.out.println("Divisão:" + (numeros.get(0) / numeros.get(1)));
    }
}