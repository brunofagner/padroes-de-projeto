import java.util.Scanner;

import State.EstadoJogo;
import State.Invoker;

public class Principal{

      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            EstadoJogo estadoJogo = new EstadoJogo();

            int pos;

            int nJogada = 0;

            Desenhar jogo = new Desenhar();

            Invoker jogada = new Invoker();

            int jogadorVez = 1;

            char[] simbolos = new char[9];
            for (int i = 0; i < simbolos.length; i++) {
                  simbolos[i] = ' ';
            }

            while (nJogada < 9){
                  jogo.desenharJogo(simbolos); 
                  if (jogadorVez == 1) {
                        System.out.println("Faça sua jogada jogador 1");
                        jogo.desenharJogo(simbolos); 
                        pos = input.nextInt();
                        if (simbolos[pos] != ' ') {
                              System.out.println("Posição já ocupada!");
                              continue;
                        }
                        jogada.invoke("X", simbolos, pos);
                        nJogada++;
                        jogadorVez = 2;
                        if (estadoJogo.ganho(simbolos)) {
                              jogo.desenharJogo(simbolos); 
                              System.out.println("Jogador 1 ganhou");
                              break;
                        }
                        
                  }else{
                        System.out.println("Faça sua jogada jogador 2");
                        jogo.desenharJogo(simbolos); 
                        pos = input.nextInt();
                        if (simbolos[pos] != ' ') {
                              System.out.println("Posição já ocupada!");
                              continue;
                        }
                        jogada.invoke("O", simbolos, pos);
                        nJogada++;
                        jogadorVez = 1;
                        if (estadoJogo.ganho(simbolos)) {
                              jogo.desenharJogo(simbolos); 
                              System.out.println("Jogador 2 ganhou");
                              break;
                        }
                  }
                  if (nJogada == 9) {
                        jogo.desenharJogo(simbolos); 
                        System.out.println("Deu velha");
                  }
            }
            
            input.close();
      }
}