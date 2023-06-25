package uno;

import enums.Wildcard;

public class CartaWildcard extends Carta {

	public CartaWildcard(Wildcard wildcard) {
		super(wildcard);
	}

	@Override
	public void executarAcao() {
		if (Wildcard.COMPRA_4 != null) {

		} else if (Wildcard.TROCA_COR != null) {

		}
	}

}
