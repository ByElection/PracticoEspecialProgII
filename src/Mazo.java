import java.util.ArrayList;

public class Mazo {

	private ArrayList<Carta> cartas;
	
	public Mazo(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public void removeCarta() {
		cartas.remove(0);
	}
	
	public void addCarta(Carta c) {
		cartas.add(c);
	}
	
	public void abarajar() {
		ArrayList<Carta> aux = new ArrayList<Carta>();
		
	}
}
