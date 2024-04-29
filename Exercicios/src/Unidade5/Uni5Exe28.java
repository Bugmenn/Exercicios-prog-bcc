package Unidade5;

import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int totalVotos = 0;
        double qt1 = 0;
        double qt2 = 0;
        double qt3 = 0;
        double qt4 = 0;

        while (true) {
            System.out.print("Informe seu voto:");
            int voto = s.nextInt();

            switch (voto) {
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
            
                default:
                    break;
            }

            totalVotos++;

            System.out.println("mais um voto: s (SIM) / n (NÃO)?");
            char escolha = s.next().charAt(0);

            if (escolha == 'n') {
                break;
            }
        }

        System.out.println("Votos:\nGrupo 1-"+(int)qt1+", Grupo 2-"+(int)qt2+", Grupo 3-"+(int)qt3+", Grupo 4-"+(int)qt4);
        System.out.println("Percentual:\nGrupo 1-"+(int)((qt1/totalVotos)*100)+"%, Grupo 2-"+(int)((qt2/totalVotos)*100)+
        "%, Grupo 3-"+(int)((qt3/totalVotos)*100)+"%, Grupo 4-"+(int)((qt4/totalVotos)*100)+"%");

        if (qt1 > qt2 && qt1 > qt3 && qt1 > qt4) {
            System.out.println("Grupo 1 é vencedor!!!");
        } else if (qt2 > qt1 && qt2 > qt3 && qt2 > qt4) {
            System.out.println("Grupo 2 é vencedor!!!");
        } else if (qt3 > qt1 && qt3 > qt2 && qt3 > qt4) {
            System.out.println("Grupo 3 é vencedor!!!");
        } else {
            System.out.println("Grupo 4 é vencedor!!!");
        }

        s.close();
    }
}
