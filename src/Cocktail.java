import java.util.ArrayList;

public class Cocktail implements Pocion {
	ArrayList<Pocion> componentes;
	
	public Cocktail() {
		componentes = new ArrayList<Pocion>();
	}
	
	@Override
	public void aplicarEfecto(AtributoDinamico atributo) {
		for (Pocion componente : componentes) {
			componente.aplicarEfecto(atributo);;
		}
	}

}
