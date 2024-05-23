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

        boolean continuar = true;
        while (continuar) {
            Menu();
            
            System.out.print("Informe o número da função que deseja realizar:");
            int escolha = s.nextInt();
            
            switch (escolha) {
                case 1:
                    Incluir(s, vetor, contador);
                    break;

                case 2:
                    Pesquisar(s, vetor, contador);
                    break;
                
                case 3:
                    Alterar(s, vetor, contador);
                    break;

                case 4:
                    Excluir(s, vetor, contador);
                    break;

                case 5:
                    Mostrar(vetor, contador[0]);
                    break;
                
                case 6:
                    Ordenar(vetor, contador[0]);
                    break;
                
                case 7:
                    Inverter(vetor, contador[0]);
                    break;

                case 8:
                    Sair(continuar);
                    break;

                default:
                    break;
            }
        }    
    }

    private void Menu() {
        System.out.println("\n1-Incluir valor\n2-Pesquisar valor\n3-Alterar valor\n4-Excluir valor\n"+
        "5-Mostrar valores\n6-Ordenar valores\n7-Inverter valores\n8-Sair do sistema");
    }

    private void Incluir(Scanner s, int vetor[], int contador[]) {
        System.out.print("Informe o valor:");
        int numero = s.nextInt();
        if (contador[0] > -1) {
            vetor[contador[0]] = numero;
            contador[0]--;
            System.out.println("Valor incluido no vetor");    
        } else {
            System.out.println("Valor não incluido no vetor");
        }
    }

    private void Pesquisar(Scanner s, int vetor[], int contador[]) {
        System.out.print("Informe o valor:");
        int numero = s.nextInt();
        for (int i = vetor.length-1; i > contador[0]; i--) {
            if (vetor[i] == numero) {
                System.out.println("O número "+numero+" está presente no vetor");
                break;
            } else if (vetor[i] != numero && i == contador[0]+1) {
                System.out.println("O número "+numero+" não está presente no vetor");
            }
        }
    }

    private void Alterar(Scanner s, int vetor[], int contador[]) {
        System.out.print("Informe o valor que deseja alterar:");
        int numero = s.nextInt();
        System.out.print("Informe o novo valor:");
        int novo = s.nextInt();
        for (int i = vetor.length-1; i > contador[0]; i--) {
            if (vetor[i] == numero) {
                vetor[i] = novo;
                break;
            } else if (vetor[i] != numero && i == contador[0]+1) {
                System.out.println("Número não encontrado");
            }
        }
    }

    private void Excluir(Scanner s, int vetor[], int contador[]) {
        System.out.print("Informe o valor que deseja excluir:");
        int numero = s.nextInt();
        if (vetor.length-1 == contador[0]) {
            System.out.println("Valor "+numero+" não excluido");
        }
        for (int i = vetor.length-1; i > contador[0]; i--) {
            if (vetor[i] == numero) {
                for (int j = i; j > contador[0]; j--) {
                    vetor[j] = vetor[j-1];
                }
                contador[0]++;
                System.out.println("Valor "+numero+" excluido");
                break;
            } else if (vetor[i] != numero && i == contador[0]+1) {
                System.out.println("Valor "+numero+" não excluido");
            }
        }
    }

    private void Mostrar(int vetor[], int contador) {
        for (int i = vetor.length-1; i > contador; i--) {
            System.out.print(vetor[i]+" ");
        }   
    }

    private void Ordenar(int vetor[], int contador) {
        int vetor2[] = new int[vetor.length-contador-1];
        
        int j = vetor2.length-1;
        for (int i = vetor.length-1; j > -1; i--) {
            vetor2[j] = vetor[i];
            j--;
        }

        for (int i = 0; i < vetor2.length-1;) {
            if (vetor2[i] > vetor2[i+1]) {
                int temp = vetor2[i];
                vetor2[i] = vetor2[i+1];
                vetor2[i+1] = temp;
                i = 0;
            } else {
                i++;
            }
        }

        for (int i : vetor2) {
            System.out.print(i+" ");
        }
    }

    private void Inverter(int vetor[], int contador) {
        int j = contador+1;
        for (int i = vetor.length-1; i > contador; i--) {
            if (i == j) {
                break;
            }
            int temp = vetor[i];
            System.out.print(temp);
            vetor[i] = vetor[j];
            vetor[j] = temp;
            j++;
        }
    }

    private boolean Sair(boolean continuar) {
        continuar = false;
        return continuar;
    }
}
