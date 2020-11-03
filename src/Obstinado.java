import java.util.ArrayList;
import java.util.Scanner;

public class Obstinado extends ModoDeJuego {
	
	@Override
	public void seleccionarAtributo(Carta c) {
		if (atributoseleccionado==null) {
			ArrayList<AtributoDinamico> atributos= c.getAtributos();
			System.out.println("seleccione el atributo para competir: ");
			for (int i = 0; i < atributos.size(); i++) {
				System.out.println(i+1 +". "+ atributos.get(i).getNombreAtributo());
			}
			Scanner scan = new Scanner(System.in);
			int elegido = scan.nextInt();
			atributoseleccionado = atributos.get(elegido-1).getNombreAtributo();
		}
	}
}
