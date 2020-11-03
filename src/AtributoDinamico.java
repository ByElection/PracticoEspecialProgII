
public class AtributoDinamico {
	
	private String nombre;
	private int valor;
	
	public AtributoDinamico(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	public String getNombreAtributo() {
		return nombre;
	}
	
	public int getValorAtributo() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			AtributoDinamico otra = (AtributoDinamico) obj;
	        	return this.getNombreAtributo().equals(otra.getNombreAtributo());
	        } catch (Exception e){
	            return false;
	        }
	 }
	
	@Override
    public String toString() {
        return this.getNombreAtributo()+":"+this.getValorAtributo();
    }
}
