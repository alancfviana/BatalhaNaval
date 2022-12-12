package alan.daniel.gabriel.batalhanaval.util;

import alan.daniel.gabriel.batalhanaval.enums.Jogadores;
import static alan.daniel.gabriel.batalhanaval.util.JogadaJogador.*;
import static alan.daniel.gabriel.batalhanaval.util.JogadaCPU.*;

public class Jogada {
    public static Jogadores main(Jogadores jogador) {
        if (jogador == Jogadores.JOGADOR) {
            JogadaJogador();
            jogador = Jogadores.CPU;
            return jogador;
        }else {
            JogadaCPU();
            jogador = Jogadores.JOGADOR;
            return jogador;

        }

        }
    }

