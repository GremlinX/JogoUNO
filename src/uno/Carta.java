package uno;

import enums.Cor;
import enums.Efeito;
import enums.Wildcard;

public abstract class Carta {
	private int numero;
	private Cor cor;
	private Efeito efeito;
	private Wildcard wildcard;

	// CONSTRUCTORS
	public Carta(int numero, Cor cor) {
		this.numero = numero;
		this.cor = cor;
	}

	public Carta(Efeito efeito, Cor cor) {
		this.cor = cor;
		this.efeito = efeito;
	}

	public Carta(Wildcard wildcard) {
		this.wildcard = wildcard;
	}

	// GETTERS
	public int getNumero() {
		return numero;
	}

	public Cor getCor() {
		return cor;
	}

	public Efeito getEfeito() {
		return efeito;
	}

	public Wildcard getWildcard() {
		return wildcard;
	}

	// SPECIAL METHODS
	public abstract void executarAcao();

	@Override
	public String toString() {
		if (numero != 0 && cor != null) {
			return "" + numero + " " + cor;
		} else if (cor != null && efeito != null) {
			return "" + efeito + " " + cor;
		} else if (wildcard != null) {
			return "" + wildcard;
		}
		return "...";
	}
}