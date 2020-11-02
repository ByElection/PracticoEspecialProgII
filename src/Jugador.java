import java.util.ArrayList;

public class Jugador {
	
	private String nombre;
	private Mazo cartas;
	private ArrayList<Pocion> pociones;
	private ModoDeJuego estrategia;
	
	
	public Jugador(String nombre) {
		this.nombre=nombre;
		this.cartas = new Mazo();
	}
	
	public void addPocion(Pocion pocion) {
		pociones.add(pocion);
	}
	
	public void cambiarestrategia(int estrategia) {
		if (estrategia==2) {
			this.estrategia = new Ambicioso();
		}else if (estrategia==3) {
			this.estrategia = new Obstinado();
		}else {
			this.estrategia = new Timbero();
		}
	}
	
}
