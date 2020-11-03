
public abstract class EfectoPocion {

	protected int valor;

	public EfectoPocion(int valor) {
		this.valor=valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	public abstract AtributoDinamico aplicarEfecto(AtributoDinamico atributo);

}