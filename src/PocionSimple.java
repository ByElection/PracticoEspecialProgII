
public class PocionSimple implements Pocion {
	EfectoPocion efecto;
	
	public PocionSimple(String nombre, int valor, boolean porcentaje) {
		efecto = new EfectoPocionGeneral(nombre, valor, porcentaje);
	}

	@Override
	public void aplicarEfecto(AtributoDinamico atributo) {
		efecto.aplicarEfecto(atributo);
	}

}
