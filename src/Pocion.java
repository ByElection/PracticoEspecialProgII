
public abstract class Pocion {
	private String nombre;
	public Pocion(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public abstract AtributoDinamico aplicarEfecto(AtributoDinamico atributo);

	
	@Override
	public String toString() {
		return ", se aplicó pocion "+this.getNombre()+" valor resultante: ";
	}
}
