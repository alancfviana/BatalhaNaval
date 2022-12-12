package alan.daniel.gabriel.batalhanaval.util;

public class DesenhaTabuleiro {
    private DesenhaTabuleiro(Tabuleiro tabuleiro) {
        for (int linha = 0; linha < tabuleiro.numerodelinhas; linha++) {
            if (linha == 0)
                System.out.println("\n   1   2   3 ");
            for (int coluna = 0; coluna < tabuleiro.numerodecolunas; coluna++) {
                if (coluna == 0)
                    System.out.printf((linha + 1) + " ");
                if (coluna == 1)
                    System.out.printf(" | " + tabuleiro.tabuleiro[linha][coluna] + " |");
                else
                    System.out.printf(" " + tabuleiro.tabuleiro[linha][coluna]);
            }
        }
    }
}