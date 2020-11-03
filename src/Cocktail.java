import java.util.ArrayList;

public class Cocktail extends Pocion {
	ArrayList<Pocion> componentes;
	
	public Cocktail() {
		super("Cocktail");
		componentes = new ArrayList<Pocion>();
	}
	
	public void addPocion(Pocion pocion) {
		this.componentes.add(pocion);
	}
	
	@Override
	public AtributoDinamico aplicarEfecto(AtributoDinamico atributo) {
		for (Pocion componente : componentes) {
			componente.aplicarEfecto(atributo);
		}
		return atributo;
	}
}
