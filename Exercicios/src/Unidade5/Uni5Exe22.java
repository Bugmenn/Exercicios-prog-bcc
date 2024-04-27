package Unidade5;

public class Uni5Exe22 {
    public static void main(String[] args) {
        
        double salario = 2000;
        int ano = 1995;
        double aumento = 1.5;
        
        while (ano <= 2024) {
            salario += salario*aumento;
            aumento *= 2;
            ano++;
        }
        System.out.println("Salário atual:"+salario);
    }
}
