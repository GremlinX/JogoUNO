package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jogador.Jogador;
import uno.Baralho;

/* 
 INICIANDO A PARTIDA:
 1. Embaralhar as cartas [OK]
 2. Distrubuir as cartas 1 a 1 [OK]
 3. Definir a ordem dos jogadores [OK]
 4. Definir a ordem da partida (horário ou anti-horário) [Ainda não fazer]
 5. Definir o jogador da vez [OK]
 LOOP: 
 1. Definir o jogador [OK]
 2. Escolher uma carta ou comprar [OK]
 3. Joga na mesa  (volta por item 1)
 FIM DA PARTIDA:
 - Se algum jogador estiver com 0 cartas na mão
 OU
 - Se acabar as cartas do baralho.
*/

public class Main {
	public static void main(String[] args) {
		// Configurando a partida:
		Scanner sc = new Scanner(System.in);
		Baralho baralho = new Baralho();
		// System.out.println(baralho.getBaralho());
		List<Jogador> jogadores = new ArrayList<Jogador>();
		Jogador j1 = new Jogador("P1", baralho);
		Jogador j2 = new Jogador("P2", baralho);
		jogadores.add(j1);
		jogadores.add(j2);

		// Inicia partida:
		Partida.distribuirCartas(jogadores, baralho);
		Partida.defineOrdemDosJogadores(jogadores);
		System.out.println("PARTIDA INICIADA!\nCARTA INICIAL: " + Partida.definePrimeiraCartaDaPartida(baralho));
		
		
		// Iniciar Jogadas:
		while (Partida.alguemTemCartas(jogadores) || !baralho.getBaralho().isEmpty()) {
			System.out.println(jogadores.get(Partida.obterJogadorDaVez(jogadores)).getName() + " é a sua vez!");
			System.out.println("Suas cartas: \n" + jogadores.get(Partida.obterJogadorDaVez(jogadores)).getMao());
			System.out.println("Escolha uma carta ou compre (0 = comprar):");
			int opcao = sc.nextInt();
			jogadores.get(Partida.obterJogadorDaVez(jogadores)).comprarOuEscolher(opcao);
		}

	}
}
