package Unidade5;

public class Uni5Exe21 {
    public static void main(String[] args) {
        
        double chico = 1.50;
        double ze = 1.10;
        
        int ano = 0;

        while (ze < chico) {
            ze += 0.03;
            chico += 0.02;
            ano++;
        }

        System.out.println("São necessários "+ano+" anos");
    }
}
