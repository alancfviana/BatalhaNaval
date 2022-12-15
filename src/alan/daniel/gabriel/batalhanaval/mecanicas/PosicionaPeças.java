package alan.daniel.gabriel.batalhanaval.mecanicas;

import alan.daniel.gabriel.batalhanaval.enums.Jogadores;
import alan.daniel.gabriel.batalhanaval.util.Tabuleiro;

import java.util.Random;



import static alan.daniel.gabriel.batalhanaval.util.LerTeclado.LerCoordenada;
import static alan.daniel.gabriel.batalhanaval.util.LerTeclado.LerTeclado;

public class PosicionaPeças {
    public static int numerodepecas = 10;

    public static Tabuleiro PosicionaPeças(Tabuleiro tabuleiro) {
        tabuleiro.naviostotais=numerodepecas;
        tabuleiro.naviosrestantes=numerodepecas;
        if (tabuleiro.jogador == Jogadores.JOGADOR) {
            return tabuleiro = PosicionaJogador(tabuleiro);
        } else
            return tabuleiro = PosicionaCPU(tabuleiro);

    }


    public static Tabuleiro PosicionaCPU(Tabuleiro tabuleiro) {


        for (int navio = 1; navio <= numerodepecas; navio++) {

            while (true) {

                Random aleatorio = new Random();
                int linha = aleatorio.nextInt(Tabuleiro.numerodecolunas);

                int coluna = aleatorio.nextInt(Tabuleiro.numerodecolunas);
                if (tabuleiro.tabuleiro[linha][coluna] == "N") {
                    continue;

                } else {
                    tabuleiro.tabuleiro[linha][coluna] = "N";
                    //DesenhaTabuleiro(tabuleiro, Jogadores.CPU);
                    break;
                }
            }
        }
        return tabuleiro;


    }


    public static Tabuleiro PosicionaJogador(Tabuleiro tabuleiro){
        tabuleiro.DesenhaTabuleiro();
        while(true) {
            System.out.println("Deseja posicionar seus navios automaticamente?\n0 - Não\n1 - Sim");
            int auto = LerTeclado();
            if (auto == 1) {
                for (int navio = 1; navio <= numerodepecas; navio++) {
                    while (true) {

                        Random aleatorio = new Random();
                        int linha = aleatorio.nextInt(Tabuleiro.numerodecolunas);

                        int coluna = aleatorio.nextInt(Tabuleiro.numerodecolunas);
                        if (tabuleiro.tabuleiro[linha][coluna] == "N") {
                            continue;

                        } else {
                            tabuleiro.tabuleiro[linha][coluna] = "N";

                            break;
                        }
                    }
                }
            } else if (auto == 0) {
                for (int navio = 1; navio <= numerodepecas; navio++) {

                    while (true) {
                        System.out.println("Posissione o " + navio + "º navio");
//                        System.out.println("Digite a linha");
//                        int linha = LerTeclado();
//                        System.out.println("Digite a coluna");
//                        int coluna = LerTeclado();
                        int[] coordenada = new int[2];
                        coordenada = LerCoordenada();
                        int linha = coordenada[0];
                        int coluna = coordenada[1];
                        if (tabuleiro.tabuleiro[linha][coluna] == "N") {
                            System.out.println("Já existe um navio posicionado aqui!\nTente novamente!");
                        } else {
                            tabuleiro.tabuleiro[linha][coluna] = "N";
                            tabuleiro.DesenhaTabuleiro();
                            break;
                        }
                    }
                }
            } else {
                System.out.println("Opção Invalida");
                continue;
            }
            return tabuleiro;
        }

    }
}