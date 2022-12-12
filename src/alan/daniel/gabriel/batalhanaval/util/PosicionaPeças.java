package alan.daniel.gabriel.batalhanaval.util;

import alan.daniel.gabriel.batalhanaval.enums.Jogadores;
import static alan.daniel.gabriel.batalhanaval.util.PosicionaPeçasCPU.PosicionaCPU;
import static alan.daniel.gabriel.batalhanaval.util.PosicionaPeçasJogador.PosicionaJogador;

public class PosicionaPeças {
    public static void PosicionaPeças(Jogadores jogador,Tabuleiro tabuleiro){
            if(jogador == jogador.JOGADOR){
                PosicionaJogador(tabuleiro);
            } else
                PosicionaCPU(tabuleiro);
            }
    }

