
public abstract class ModoDeJuego {
	
	protected String atributoseleccionado;
	
	public abstract void seleccionarAtributo(Carta c);
	
	public String getAtributoSeleccionado() {
		return atributoseleccionado;
	}
}
