import java.util.ArrayList;

public class Timbero extends ModoDeJuego {

	@Override
	public void seleccionarAtributo(Carta c) {
		ArrayList<AtributoDinamico> atributos= c.getAtributos();
		atributoseleccionado = atributos.get((int) (Math.random()*atributos.size())).getNombreAtributo();
	}
}