
public class EfectoPocionSelectiva extends EfectoPocion{

	private String atributo;

	public EfectoPocionSelectiva(int valor, String atributo) {
		super(valor);
		this.atributo=atributo;
	}
	
	public AtributoDinamico aplicarEfecto(AtributoDinamico atributo) {
		int valorretorno;
		if (this.atributo.equals(atributo.getNombreAtributo())) {
			valorretorno = atributo.getValorAtributo()+atributo.getValorAtributo()*getValor()/100;
		}else {
			valorretorno = atributo.getValorAtributo();
		}
		atributo.setValor(valorretorno);
		return atributo;
	}

}
