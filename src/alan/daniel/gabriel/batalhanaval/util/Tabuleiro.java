package alan.daniel.gabriel.batalhanaval.util;

import alan.daniel.gabriel.batalhanaval.enums.Jogadores;
import alan.daniel.gabriel.batalhanaval.enums.Letras;

public class Tabuleiro {
    final protected int numerodelinhas = 10;

    static final public int numerodecolunas = 10;
    public int naviosrestantes;
    public int naviosafundados;
    public int naviostotais;
    public Jogadores jogador;
    public String[][] tabuleiro = new String[numerodelinhas][numerodecolunas];




    public Tabuleiro(Jogadores jogador) {
     String[][] tabuleiro = new String[numerodelinhas][numerodecolunas];
         for (int linha = 0; linha < tabuleiro.length; linha++) {
             for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                 tabuleiro[linha][coluna] = " ";
             }
         }
         this.tabuleiro = tabuleiro;
         this.jogador = jogador;
         this.naviosrestantes = 0;
         this.naviosafundados = 0;
         this.naviostotais = 0;

     }

    public void DesenhaTabuleiro() {
        String[] letra = Letras.letras();
        System.out.println("\n---------------------------------------------");
        if(jogador==Jogadores.JOGADOR) {
            System.out.println("                   JOGADOR                   ");
        }else {
            System.out.println("                    CPU                      ");
        }
        System.out.println("---------------------------------------------");
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            if (linha == 0)
                for(int colunas = 0;colunas < tabuleiro[linha].length; colunas++ ) {
                    if(colunas == 0){
                        System.out.print("|   |");
                    }
                    System.out.printf(" " + colunas + " |");
                }
            System.out.printf("\n---------------------------------------------\n");
            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
                if (coluna == 0){
                    System.out.printf("| " + letra[linha] + " |");
                }
                System.out.printf(" " + tabuleiro[linha][coluna] + " |");
            }

        }
        System.out.printf("\n---------------------------------------------\n");
    }

    }


