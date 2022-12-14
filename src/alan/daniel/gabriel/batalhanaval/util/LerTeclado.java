package alan.daniel.gabriel.batalhanaval.util;

import alan.daniel.gabriel.batalhanaval.exeption.NumeroErrado;

import java.util.Scanner;

public class LerTeclado {

    public static int LerTeclado() {
        Scanner scan = new Scanner(System.in);
        int numero;
        try {
            numero = scan.nextInt();
            if(numero >= 0 && numero < Tabuleiro.numerodecolunas) {
                return numero;
            }else{
                System.out.println("Número Inválido");
                    throw new NumeroErrado("Número Inválido");
                }
           }catch (NumeroErrado e){

            return LerTeclado();
        }catch (RuntimeException e){
            System.out.println("Digite um número válido");
            return LerTeclado();
        }
    }
    public static int[] LerCoordenada(){
        System.out.println("Digite uma coordenada");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char linhac = s.toLowerCase().charAt(0);
        try {
            int linha = linhac-'a';
            int coluna = Integer.parseInt(s.substring(1));
            if(linha >= 0 && linha < Tabuleiro.numerodecolunas) {
                if(coluna >= 0 && coluna < Tabuleiro.numerodecolunas) {
                    int[] coordenada = new int[]{linha, coluna};
                    return coordenada;
                }
            }
            else{
                System.out.println("Coordenada Inválida");
                throw new NumeroErrado("Coordenada Inválida");
            }
        }catch (NumeroErrado e){
            System.out.println("Digite uma coordenada válida");
            return LerCoordenada();
        }catch (RuntimeException e){
            System.out.println("Digite uma coordenada válida");
            return LerCoordenada();
        }
        System.out.println("Digite uma coordenada válida");
        return LerCoordenada();
    }
    public static void pausa() {
        System.out.println("\nAperte Enter para continuar...");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }
}
