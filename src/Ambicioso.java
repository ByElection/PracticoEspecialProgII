import java.util.ArrayList;

public class Ambicioso extends ModoDeJuego {

	@Override
	public void seleccionarAtributo(Carta c) {
		ArrayList<AtributoDinamico> atributos= c.getAtributos();
		int x = 0;
		for (int i = 1; i < atributos.size(); i++) {
			if (atributos.get(x).getValorAtributo()<atributos.get(i).getValorAtributo()) {
				x=i;
			}
		}
		atributoseleccionado = atributos.get(x).getNombreAtributo();
	}

}

