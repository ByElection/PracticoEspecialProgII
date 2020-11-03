import java.util.ArrayList;

public class Carta {
	
	private String nombre;
	private ArrayList<AtributoDinamico> atributos;
	private Pocion pocion;
	
	public Carta(String nombre) {
		this.nombre = nombre;
		this.atributos = new ArrayList<>();
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
	
	public void addAtributo(String nombre, int valor) {
		if (!tieneAtributo(nombre))
			this.atributos.add(new AtributoDinamico(nombre,valor));
	}
	
	public AtributoDinamico getAtributo(String nombre) {
		for(int i=0; i<atributos.size(); i++) {
			if (atributos.get(i).getNombreAtributo().equals(nombre))
				return atributos.get(i);
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
	
}

	
	
