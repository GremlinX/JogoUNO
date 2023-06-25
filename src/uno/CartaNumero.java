package uno;

import enums.Cor;

public class CartaNumero extends Carta {

	public CartaNumero(int numero, Cor cor) {
		super(numero, cor);
	}

	@Override
	public void executarAcao() {
		// Cartas números não possuem ações.
	}

}
