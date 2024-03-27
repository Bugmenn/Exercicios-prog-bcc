package aula_3;

public class Exe6 {
    String modelo;
    float capacidade_tanque;
    float quilometragem_rodada;

    float calcularMediaCosumo() {
        return quilometragem_rodada/capacidade_tanque;
    }
}
