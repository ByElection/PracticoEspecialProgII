
public class PocionSimple extends Pocion {
	EfectoPocion efecto;
	
	public PocionSimple(String nombre, int valor, boolean porcentaje) {
		super(nombre);
		efecto = new EfectoPocionGeneral(valor, porcentaje);
	}
	
	public PocionSimple(String nombre, int valor, String atributo) {
		super(nombre);
		efecto = new EfectoPocionSelectiva(valor, atributo);
	}

	@Override
	public AtributoDinamico aplicarEfecto(AtributoDinamico atributo) {
		efecto.aplicarEfecto(atributo);
		return atributo;
	}

}
