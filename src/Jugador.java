import java.util.ArrayList;

public class Jugador {
	
	private int numjugador;
	private Mazo cartas;
	
	
	public Jugador(int numjugador) {
		this.numjugador=numjugador;
		this.cartas = new Mazo();
	}
	
	public AtributoDinamico eleguirAtributo() {
		return cartas.darCarta().getAtributo();
	}
	
}
