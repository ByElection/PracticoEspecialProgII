
public class EfectoPocionGeneral extends EfectoPocion{
	
	private boolean esporcentaje;
	
	public EfectoPocionGeneral(int valor, boolean esporcentaje) {
		super(valor);
		this.esporcentaje=esporcentaje;
	} 
	
	public AtributoDinamico aplicarEfecto(AtributoDinamico atributo) {
		int valorretorno;
		if (esporcentaje) {
			valorretorno=atributo.getValorAtributo()+atributo.getValorAtributo()*valor/100;
		}else {
			valorretorno=valor;
		}
		atributo.setValor(valorretorno);
		return atributo;
	}

}
