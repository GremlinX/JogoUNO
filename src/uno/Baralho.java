package uno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import enums.Cor;
import enums.Efeito;
import enums.Wildcard;

// 9x4 + 3*4 + 4 = 52 cartas

public class Baralho {
	private List<Carta> baralho;

	public List<Carta> getBaralho() {
		return baralho;
	}

	// CONSTRUCTOR
	public Baralho() {
		// CREATE THE DECK
		baralho = new ArrayList<>();
		popularBaralhoComCartasNumeros();
		popularBaralhoComCartasEspeciais();
		popularBaralhoComCartasCoringa();
		embaralhar();
	}

	/* SPECIAL METHODS */
	// CREATE ALL NUMERIC CARDS AND POPULATE DECK
	private void popularBaralhoComCartasNumeros() {
		for (int i = 1; i <= 9; i++) {
			for (Cor cor : Cor.values()) {
				baralho.add(new CartaNumero(i, cor));
			}
		}
	}

	// CREATE ALL SPECIAL CARDS AND POPULATE DECK
	private void popularBaralhoComCartasEspeciais() {
		for (Efeito efeito : Efeito.values()) {
			for (Cor cor : Cor.values()) {
				baralho.add(new CartaEspecial(efeito, cor));
			}
		}
	}

	// CREATE ALL WILDCARDS AND POPULATE DECK
	private void popularBaralhoComCartasCoringa() {
		for (int i = 1; i <= 2; i++) {
			for (Wildcard wildcard : Wildcard.values()) {
				baralho.add(new CartaWildcard(wildcard));
			}
		}
	}

	// SHUFFLE THE CARDS
	private void embaralhar() {
		Collections.shuffle(baralho);
	}

	// PRINT DECK (unecessary)
	public void imprimeBaralho() {
		for (int i = 1; i <= 9; i++) {
			for (Cor cor : Cor.values()) {
				System.out.println(i + " " + cor);
			}
			System.out.print("");
		}
		for (Cor cor : Cor.values()) {
			for (Efeito efeito : Efeito.values()) {
				System.out.println(cor + " " + efeito);
			}
		}
		for (Wildcard wildcard : Wildcard.values()) {
			System.out.println(wildcard);
		}
	}

}
