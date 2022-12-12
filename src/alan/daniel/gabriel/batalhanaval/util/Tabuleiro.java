package alan.daniel.gabriel.batalhanaval.util;

import alan.daniel.gabriel.batalhanaval.enums.Jogadores;

    public class Tabuleiro {
    protected static int numerodelinhas = 10;
    protected static int numerodecolunas = 10;

    protected static String[][] tabuleiro = new String[numerodelinhas][numerodecolunas];
     public Tabuleiro(Jogadores jogador) {

     this.tabuleiro = tabuleiro;
         for (int linha = 0; linha < tabuleiro.length; linha++) {
             for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                 tabuleiro[linha][coluna] = " ";
             }
         }

     }

}


