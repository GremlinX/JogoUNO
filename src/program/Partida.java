package program;

import java.util.Collections;
import java.util.List;

import jogador.Jogador;
import uno.Baralho;
import uno.Carta;

public class Partida {
	private static int jogadorAtual = 0;

	public static void distribuirCartas(List<Jogador> jogadores, Baralho baralho) {
		for (int i = 0; i < jogadores.size(); i++) {
			jogadores.get(i).receberCartas(jogadores, baralho);
		}
	}

	public static void cartasRestantes(Baralho baralho) {
		System.out.println(baralho.getBaralho().size());
	}

	public static void defineOrdemDosJogadores(List<Jogador> jogadores) {
		Collections.shuffle(jogadores);
	}

	public static int obterJogadorDaVez(List<Jogador> jogadores) {
		return jogadorAtual = (jogadorAtual + 1) % jogadores.size();
	}

	public static boolean alguemTemCartas(List<Jogador> jogadores) {
		for (Jogador jogador : jogadores) {
			if (!jogador.getMao().isEmpty()) {
				return true;
			}
		}
		return false;
	}

	public static Carta definePrimeiraCartaDaPartida(Baralho baralho) {
		return baralho.getBaralho().remove(0);
	}
}
