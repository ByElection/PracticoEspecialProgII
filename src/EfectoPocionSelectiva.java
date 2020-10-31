
public class EfectoPocionSelectiva extends EfectoPocion{

	private String atributo;

	public EfectoPocionSelectiva(String nombre, int valor, String atributo) {
		super(nombre, valor);
		this.atributo=atributo;
	}
	
	public int aplicarEfecto(AtributoDinamico atributo) {
		if (this.atributo.equals(atributo.getNombreAtributo())) {
			return atributo.getValorAtributo()+atributo.getValorAtributo()*getValor()/100;
		}else {
			return atributo.getValorAtributo();
		}
	}

}
