package jogador;

import java.util.ArrayList;
import java.util.List;

import uno.Baralho;
import uno.Carta;

public class Jogador {
	private String name;
	private List<Carta> mao;
	Baralho baralho;

	// CONSTRUCTORS
	public Jogador(String name, Baralho baralho) {
		this.name = name;
		this.baralho = baralho;
		mao = new ArrayList<>();
	}

	// GETTERS
	public String getName() {
		return name;
	}

	public List<Carta> getMao() {
		return mao;
	}

	// SPECIAL METHODS
	public void adicionarCarta(Carta carta) {
		mao.add(carta);
	}

	public void removerCarta(Carta carta) {
		mao.remove(carta);
	}

	public void receberCartas(List<Jogador> jogador, Baralho baralho) {
		for (int i = 0; i < 9; i++) {
			this.adicionarCarta(baralho.getBaralho().remove(i));
		}
	}

	private void comprar(Jogador jogador, Baralho baralho) {
		this.adicionarCarta(baralho.getBaralho().remove(0));
	}

	private void jogarCartaNaMesa() {
//		this.getMao().
	}

	public void comprarOuEscolher(int opcao) {
		if (opcao == 0) {
			this.comprar(this, baralho);
			System.out.println("Jogador " + name + " comprou uma carta!");
		} else {
//			 this.getMao().get(opcao)
		}
	}
}
