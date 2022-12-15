package alan.daniel.gabriel.batalhanaval.util;

import alan.daniel.gabriel.batalhanaval.mecanicas.PosicionaPeças;

public class Termino {

//    Se não teminou retorna 0
//    Se jogador ganhou retorna 1
//    Se cpu ganhou retorna 2
    public static int Termino(String[][] jogador1, String[][] jogador2) {
        int naviosafundados1 = 0;
        int naviosafundados2 = 0;

        for (int linha = 0; linha < jogador1.length; linha++) {
            for (int coluna = 0; coluna < jogador1[linha].length; coluna++) {
                if (jogador1[linha][coluna] == "*" || jogador1[linha][coluna] == "X") {
                    naviosafundados1++;
                }
            }
            if (naviosafundados1 == PosicionaPeças.numerodepecas)
                return 1;
        }
        for (int linha = 0; linha < jogador1.length; linha++) {
            for (int coluna = 0; coluna < jogador1[linha].length; coluna++) {
                if (jogador2[linha][coluna] == "*" || jogador2[linha][coluna] == "X") {
                    naviosafundados2++;
                }
            }
            if (naviosafundados2 == PosicionaPeças.numerodepecas)
                return 2;
        }
        return 0;
    }
}