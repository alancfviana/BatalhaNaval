
package alan.daniel.gabriel.batalhanaval;

import alan.daniel.gabriel.batalhanaval.enums.Jogadores;
import alan.daniel.gabriel.batalhanaval.util.LerTeclado;
import alan.daniel.gabriel.batalhanaval.util.Tabuleiro;




import static alan.daniel.gabriel.batalhanaval.mecanicas.Jogada.Jogada;
import static alan.daniel.gabriel.batalhanaval.mecanicas.PosicionaPeças.PosicionaPeças;


import static alan.daniel.gabriel.batalhanaval.enums.Jogadores.*;
import static alan.daniel.gabriel.batalhanaval.util.Termino.Termino;

public class BatalhaNaval {
    public static void main(String[] args) {
        int termino = 0;

        Tabuleiro TabuleiroJogador = new Tabuleiro(JOGADOR);
        Tabuleiro TabuleiroCpu = new Tabuleiro(CPU);
        Jogadores jogador = TabuleiroJogador.jogador;
        TabuleiroJogador = PosicionaPeças(TabuleiroJogador);
        TabuleiroCpu = PosicionaPeças(TabuleiroCpu);
        do{
            if(jogador== JOGADOR) {
                TabuleiroJogador.DesenhaTabuleiro();
                TabuleiroJogador = Jogada(TabuleiroJogador, TabuleiroCpu);
                System.out.println("\nVocê ainda possui "+TabuleiroJogador.naviosrestantes+" navios\nVocê afundou "+TabuleiroJogador.naviosafundados+" navios");
                jogador = TabuleiroCpu.jogador;
            }else {
                //TabuleiroCpu.DesenhaTabuleiro();
                TabuleiroCpu = Jogada(TabuleiroCpu, TabuleiroJogador);
                jogador = TabuleiroJogador.jogador;
            }
            //LerTeclado.pausa();
            termino = Termino(TabuleiroJogador.tabuleiro,TabuleiroCpu.tabuleiro);
            } while (termino==0);
        System.out.println("\n\n---------------------------------------------");
        System.out.println("                 FIM DE JOGO                 ");
        System.out.println("---------------------------------------------\n");
        TabuleiroJogador.DesenhaTabuleiro();
        TabuleiroCpu.DesenhaTabuleiro();

        if(termino==1)
        System.out.println("\n\n********************************\nO Jogador Venceu!\n********************************");
        if(termino==2)
        System.out.println("\n\n********************************\nA CPU Venceu!\n********************************");

            }

    }
