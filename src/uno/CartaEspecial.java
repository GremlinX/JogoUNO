package uno;

import enums.Cor;
import enums.Efeito;

public class CartaEspecial extends Carta {

	public CartaEspecial(Efeito efeito, Cor cor) {
		super(efeito, cor);
	}

	@Override
	public void executarAcao() {
		if (Efeito.CANCELAR != null) {

		} else if (Efeito.COMPRA_2 != null) {

		} else if (Efeito.INVERTER != null) {

		}
	}

}
