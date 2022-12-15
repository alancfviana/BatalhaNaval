package alan.daniel.gabriel.batalhanaval.mecanicas;

import alan.daniel.gabriel.batalhanaval.enums.Jogadores;
import alan.daniel.gabriel.batalhanaval.enums.Letras;
import alan.daniel.gabriel.batalhanaval.util.Tabuleiro;

import java.util.Random;


import static alan.daniel.gabriel.batalhanaval.util.LerTeclado.LerCoordenada;

public class Jogada {
    public static Tabuleiro Jogada(Tabuleiro tabuleiro1, Tabuleiro tabuleiro2) {
        if (tabuleiro1.jogador == Jogadores.JOGADOR) {
            return tabuleiro1 = JogadaJogador(tabuleiro1,tabuleiro2);
        }else {
            return tabuleiro1 = JogadaCPU(tabuleiro1,tabuleiro2);
        }

        }


    public static Tabuleiro JogadaCPU(Tabuleiro tabuleiro1, Tabuleiro tabuleiro2){
        String[] letra = Letras.letras();

        while(true) {
            Random aleatorio = new Random();
            int linha = aleatorio.nextInt(Tabuleiro.numerodecolunas);

            int coluna = aleatorio.nextInt(Tabuleiro.numerodecolunas);

            if(tabuleiro1.tabuleiro[linha][coluna]=="*"||tabuleiro1.tabuleiro[linha][coluna]=="n"||tabuleiro1.tabuleiro[linha][coluna]=="X"||tabuleiro1.tabuleiro[linha][coluna]=="-"){
                //System.out.println("Posição já jogada, jogue novamente em uma posição não jogada");
                continue;
            }
            System.out.println("CPU jogou "+letra[linha]+""+coluna);
            if(tabuleiro2.tabuleiro[linha][coluna]=="N"||tabuleiro2.tabuleiro[linha][coluna]=="n"||tabuleiro2.tabuleiro[linha][coluna]=="X") {
                {
                    tabuleiro1.naviosafundados++;
                    tabuleiro2.naviosrestantes--;
                    System.out.println("\n===============\nNavio afundado!\n===============");
                }if(tabuleiro1.tabuleiro[linha][coluna]=="N"){
                    tabuleiro1.tabuleiro[linha][coluna] = "X";

                }
                else{
                    tabuleiro1.tabuleiro[linha][coluna] = "*";
                }
                break;
            }else {
                System.out.println("\n+++++\nÁgua!\n+++++");
                if(tabuleiro1.tabuleiro[linha][coluna]=="N") {
                    tabuleiro1.tabuleiro[linha][coluna] = "n";
                }else{
                    tabuleiro1.tabuleiro[linha][coluna] = "-";
                }
            }
            break;
        }
        return tabuleiro1;
    }


    public static Tabuleiro JogadaJogador(Tabuleiro tabuleiro1, Tabuleiro tabuleiro2) {
        while(true) {
            System.out.println("Faça a sua jogada");
            int[] coordenada = new int[2];
            coordenada = LerCoordenada();
            int linha = coordenada[0];
            int coluna = coordenada[1];
//            System.out.println("Digite a linha");
//            int linha = LerTeclado();
//            System.out.println("Digite a coluna");
//            int coluna = LerTeclado();
            if(tabuleiro1.tabuleiro[linha][coluna]=="*"||tabuleiro1.tabuleiro[linha][coluna]=="n"||tabuleiro1.tabuleiro[linha][coluna]=="X"||tabuleiro1.tabuleiro[linha][coluna]=="-"){
                System.out.println("\nPosição já jogada, jogue novamente em uma posição não jogada\n");
                continue;
            }
            if(tabuleiro2.tabuleiro[linha][coluna]=="N"||tabuleiro2.tabuleiro[linha][coluna]=="n"||tabuleiro2.tabuleiro[linha][coluna]=="X") {
                {
                    tabuleiro1.naviosafundados++;
                    tabuleiro2.naviosrestantes--;
                    System.out.println("\n%%%%%%%%%%%%%%%\nNavio afundado!\n%%%%%%%%%%%%%%%");
                }if(tabuleiro1.tabuleiro[linha][coluna]=="N"){
                    tabuleiro1.tabuleiro[linha][coluna] = "X";

                }
                else{
                    tabuleiro1.tabuleiro[linha][coluna] = "*";
                }
                break;
            }else {
                System.out.println("\n+++++\nÁgua!\n+++++");
                if(tabuleiro1.tabuleiro[linha][coluna]=="N") {
                    tabuleiro1.tabuleiro[linha][coluna] = "n";
                }else{
                    tabuleiro1.tabuleiro[linha][coluna] = "-";
                }
            }
            break;
        }
        return tabuleiro1;
    }
}