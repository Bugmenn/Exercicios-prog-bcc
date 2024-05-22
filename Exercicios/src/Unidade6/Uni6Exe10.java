package Unidade6;

import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) {
        new Uni6Exe10();
    }

    public Uni6Exe10() {
        Scanner s = new Scanner(System.in);

        int vetor[] = new int[50];
        int contador[] = {49};

        while (true) {
            System.out.println("1-Incluir valor\n2-Pesquisar valor\n3-Alterar valor\n4-Excluir valor\n"+
            "5-Mostrar valores\n6-Ordenar valores\n7-Inverter valores\n8-Sair do sistema");
            System.out.print("Informe o número da função que deseja realizar:");
            int escolha = s.nextInt();
            
            switch (escolha) {
                case 1:
                    Incluir(s, vetor, contador);
                    break;
            
                default:
                    break;
            }

            System.out.println(contador);
            for (int j : vetor) {
                System.out.print(j+" ");
            }   
        }    
    }

    private void Incluir(Scanner s, int vetor[], int contador[]) {
        if (contador[0] > 0) {
            System.out.print("Informe o valor:");
            int numero = s.nextInt();
            vetor[contador[0]] = numero;
            contador[0]--;
            System.out.println("Valor incluido no vetor");    
        } else {
            System.out.println("Valor não incluido no vetor");
        }
    }
}
