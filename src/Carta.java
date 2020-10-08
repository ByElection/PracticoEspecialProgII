
public class Carta {
	
	private String nombre;
	private int altura;
	private int peso;
	private int fuerza;
	private int peleas_gandas;
	private int velocidad;
	
	public Carta(String nombre, int altura, int peso, int fuerza, int peleas_gandas, int velocidad) {
		this.nombre = nombre;
		this.altura = altura;
		this.peso = peso;
		this.fuerza = fuerza;
		this.peleas_gandas = peleas_gandas;
		this.velocidad = velocidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getPeleas_gandas() {
		return peleas_gandas;
	}

	public void setPeleas_gandas(int peleas_gandas) {
		this.peleas_gandas = peleas_gandas;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	
}
