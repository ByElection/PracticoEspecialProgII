import java.util.ArrayList;

public class Carta {
	
	private String nombre;
	private ArrayList<AtributoDinamico> atributos;
	private Pocion pocion;
	
	public Carta(String nombre) {
		this.nombre = nombre;
		this.atributos = new ArrayList<>();
		pocion=null;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean addPocion(Pocion pocion) {
		if (this.pocion==null) {
			this.pocion=pocion;
			return true;
		}else {
			return false;
		}
	}
	
	public AtributoDinamico usarPocion(AtributoDinamico a) {
		if (pocion!=null) {
			pocion.aplicarEfecto(a);
		}
		return a;
	}
	
	public void addAtributo(String nombre, int valor) {
		if (!tieneAtributo(nombre))
			this.atributos.add(new AtributoDinamico(nombre,valor));
	}
	
	public AtributoDinamico getAtributo(String nombre) {
		for(int i=0; i<atributos.size(); i++) {
			if (atributos.get(i).getNombreAtributo().equals(nombre)) {
				return new AtributoDinamico(atributos.get(i).getNombreAtributo(),atributos.get(i).getValorAtributo());
			}
		}
		return null;
	}
	
	public boolean tieneAtributo(String nombre) {
		AtributoDinamico atributo = this.getAtributo(nombre);
		return (atributo != null);
	}
	
	public boolean tieneAtributo(AtributoDinamico atributo) {
		return atributos.contains(atributo);
	}
	
	public int cantAtributos() {
		return this.atributos.size();
	}
	
	public boolean mismoTipo(Carta c) {
		for(int i=0; i < atributos.size(); i++) {
			if (!c.tieneAtributo(atributos.get(i))) {
				return false;
			}
		}
		if (this.cantAtributos()==c.cantAtributos()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public ArrayList<AtributoDinamico> getAtributos(){
		ArrayList<AtributoDinamico> aux = new ArrayList<AtributoDinamico>(atributos);
		return aux;
	}
	public String toStringPocion() {
		if (pocion!=null) {
			return pocion.toString();
		}else {
			return "";
		}
	}
	
	@Override
	public String toString() {
		return this.getNombre()+" con ";
	}
	
}

	
	
