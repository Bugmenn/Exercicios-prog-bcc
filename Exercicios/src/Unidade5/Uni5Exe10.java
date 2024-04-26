package Unidade5;

public class Uni5Exe10 {
    public static void main(String[] args) {
        
        int qt = 1;
        String numeros = "";

        for (int i = 10; qt <= 10; i++) {
            String texto = Integer.toString(i);

            int tamanho = texto.length();
            if (tamanho%2 == 0) {
                tamanho /= 2;
                String parte1 = texto.substring(0, tamanho);
                String parte2 = texto.substring(tamanho, texto.length());

                int parte1Int = Integer.valueOf(parte1);
                int parte2Int = Integer.valueOf(parte2);

                int conta = (parte1Int+parte2Int);
                conta *= conta;

                if (conta == i) {
                    qt++;
                    numeros += texto+", ";
                }
            }

        }
        System.out.println(numeros);
    }
}
