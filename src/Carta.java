import java.util.ArrayList;

public class Carta {
	
	private String nombre;
	private ArrayList<AtributoDinamico> atributos;
	
	public Carta(String nombre) {
		this.nombre = nombre;
		this.atributos = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
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
	
	public AtributoDinamico getAtributo(){
		int random = (int) Math.random()*atributos.size();
		return atributos.get(random);
	}
	
}

	
	
