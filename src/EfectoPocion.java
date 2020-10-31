
public abstract class EfectoPocion {

	protected String nombre;
	protected int valor;

	public EfectoPocion(String nombre, int valor) {
		this.nombre=nombre;
		this.valor=valor;
	} 

	public String getNombre() {
		return nombre;
	}

	public int getValor() {
		return valor;
	}
	
	public String toString(AtributoDinamico atributo) {
		return ", se aplicó pocion "+nombre+" valor resultante "+aplicarEfecto(atributo);
	}
	
	public abstract int aplicarEfecto(AtributoDinamico atributo);

}