
public class PocionSimple implements Pocion {
	EfectoPocion efecto;
	
	public PocionSimple(String nombre, int valor, boolean porcentaje) {
		efecto = new EfectoPocionGeneral(nombre, valor, porcentaje);
	}
	
	public PocionSimple(String nombre, int valor, String atributo) {
		efecto = new EfectoPocionSelectiva(nombre, valor, atributo);
	}

	@Override
	public void aplicarEfecto(AtributoDinamico atributo) {
		efecto.aplicarEfecto(atributo);
	}

}
