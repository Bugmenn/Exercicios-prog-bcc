package Unidade5;

import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double qtTotal = 0;
        double qt1 = 0;
        double qt2 = 0;
        double qt3 = 0;
        double qt4 = 0;
        double qtNulo = 0;
        double qtBranco = 0;

        do {
            System.out.print("Informe o voto:");
            int escolha = s.nextInt();

            if (escolha < 0 || escolha > 6) {
                System.out.println("Opção incorreta");
                continue;
            } else if (escolha == 0) {
                break;
            }

            switch (escolha) {
                case 1:
                    qt1++;
                    break;
                
                case 2:
                    qt2++;
                    break;

                case 3:
                    qt3++;
                    break;

                case 4:
                    qt4++;
                    break;

                case 5:
                    qtNulo++;
                    break;

                case 6:
                    qtBranco++;
                    break;
            
                default:
                    break;
            }

            qtTotal++;
        } while (true);

        System.out.println("Total de votos: candidato 1-"+(int)qt1+", candidato 2-"+(int)qt2+", candidato 3-"+(int)qt3+" e candidato 4-"+(int)qt4);
        System.out.println("Total de nulos:"+(int)qtNulo);
        System.out.println("Total de brancos:"+(int)qtBranco);
        System.out.println("Percentual: Branco-"+(int)((qtBranco/qtTotal)*100)+"% e Nulo-"+(int)((qtNulo/qtTotal)*100)+"%");

        s.close();
    }
}
