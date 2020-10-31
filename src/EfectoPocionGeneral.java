
public class EfectoPocionGeneral extends EfectoPocion{
	
	private boolean esporcentaje;
	
	public EfectoPocionGeneral(String nombre, int valor, boolean esporcentaje) {
		super(nombre, valor);
		this.esporcentaje=esporcentaje;
	} 
	
	public int aplicarEfecto(AtributoDinamico atributo) {
		if (esporcentaje) {
			return atributo.getValorAtributo()+atributo.getValorAtributo()*valor/100;
		}else {
			return valor;
		}
	}

}
