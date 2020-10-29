import java.util.ArrayList;
import java.util.Collections;

public class Mazo {

	private ArrayList<Carta> cartas;
	
	public Mazo() {
		this.cartas = new ArrayList<>();
	}

	public void removeCarta() {
		cartas.remove(0);
	}
	
	public void addCarta(Carta c) {
		if(cartas.isEmpty()) {
			cartas.add(c);
		}
		else {
			if (chequearCarta(c)) {
				cartas.add(c);
			}
		}
	}
	
	public void abarajar() {
		Collections.shuffle(cartas);
	}
	
	public boolean chequearCarta(Carta c) {
		return c.mismoTipo(cartas.get(0));
	}
	
	public Carta darCarta() {
		return cartas.get(0);
	}
	public int cantCartas() {
		return cartas.size();
	}
}
