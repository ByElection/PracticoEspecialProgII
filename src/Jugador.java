import java.util.Scanner;

public class Jugador {
	
	private String nombre;
	private Mazo cartas;
	private ModoDeJuego estrategia;
	private int ultimaestrategia;
	
	
	public Jugador(String nombre) {
		this.nombre=nombre;
		this.cartas = new Mazo();
	}
	
	public void removeCarta() {
		cartas.removeCarta();
	}
	
	public void addCarta(Carta c) {
		cartas.addCarta(c);
	}
	
	public int cantCartas() {
		return cartas.cantCartas();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Carta darCarta() {
		return cartas.darCarta();
	}
	
	public void seleccionarAtributo() {
		estrategia.seleccionarAtributo(cartas.darCarta());
	}
	
	public String getAtributoSeleccionado() {
		return estrategia.getAtributoSeleccionado();
	}
	
	public void cambiarEstrategia() {
		System.out.println(this.getNombre()+" elija su estrategia:");
		System.out.println("1. Timbero");
		System.out.println("2. Ambicioso");
		System.out.println("3. Obstinado");
		Scanner scan = new Scanner(System.in);
		int estrategia = scan.nextInt();
		if (estrategia!=ultimaestrategia) {
			if (estrategia==2) {
				this.estrategia = new Ambicioso();
			}else if (estrategia==3) {
				this.estrategia = new Obstinado();
			}else {
				this.estrategia = new Timbero();
			}
			ultimaestrategia=estrategia;
		}
	}
	
	public ModoDeJuego getEstrategia() {
		return estrategia;
	}
	
	@Override
	public String toString() {
		return "La carta de "+this.getNombre()+" es "+this.darCarta().toString();
	}
	
}
