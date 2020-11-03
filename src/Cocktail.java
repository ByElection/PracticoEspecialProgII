import java.util.ArrayList;

public class Cocktail implements Pocion {
	ArrayList<Pocion> componentes;
	
	public Cocktail() {
		componentes = new ArrayList<Pocion>();
	}
	
	public void addPocion(Pocion pocion) {
		this.componentes.add(pocion);
	}
	
	@Override
	public void aplicarEfecto(AtributoDinamico atributo) {
		for (Pocion componente : componentes) {
			componente.aplicarEfecto(atributo);;
		}
	}
}
