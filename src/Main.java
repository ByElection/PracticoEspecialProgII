import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//CARGA EL MAZO
		String mazoPath = "./superheroes.json";
		Mazo mazo = new Mazo();
		mazo.cargarMazo(mazoPath);
		mazo.abarajar();
		//CREA LOS JUGADORES
		System.out.println("escriba el nombre del jugador 1: ");
		Scanner scan = new Scanner(System.in);
		String njugador1 = scan.next();
		Jugador jugador1 = new Jugador(njugador1);
		System.out.println("escriba el nombre del jugador 2: ");
		String njugador2 = scan.next();
		Jugador jugador2 = new Jugador(njugador2);
		
		//CREA POCIONES
		ArrayList<Pocion> pociones=new ArrayList<Pocion>();
		pociones.add(new PocionSimple("Pocion Fortalezedora", 20, true));

		pociones.add(new PocionSimple("Pocion Fortalezedora", 10, true));

		pociones.add(new PocionSimple("Pocion Fortalezedora Plus", 50, true));

		pociones.add(new PocionSimple("Pocion Fortalezedora Plus", 60, true));
				
		pociones.add(new PocionSimple("Pocion Kriptonita", -25, true));

		pociones.add(new PocionSimple("Pocion Kriptonita", -20, true));

		pociones.add(new PocionSimple("Pocion Reductor de Plomo", -55, true));

		pociones.add(new PocionSimple("Pocion Reductor de Plomo", -50, true));

		pociones.add(new PocionSimple("Pocion Quiero Vale Cuatro", 4, false));

		pociones.add(new PocionSimple("Pocion Quiero Vale Cinco", 5, false));

		pociones.add(new PocionSimple("Pocion Numero Magico", 23, false));

		pociones.add(new PocionSimple("Pocion Numero Magico", 32, false));

		pociones.add(new PocionSimple("Pocion Selectiva Fuerza", 35, "Fuerza"));

		pociones.add(new PocionSimple("Pocion Selectiva Fuerza", 40, "Fuerza"));

		pociones.add(new PocionSimple("Pocion Selectiva Peso", 43, "Peso"));

		pociones.add(new PocionSimple("Pocion Selectiva Peso", 50, "Peso"));
		
		Cocktail cocktail = new Cocktail();
		cocktail.addPocion(new PocionSimple("Pocion Selectiva Fuerza.", 35, "Fuerza"));
		cocktail.addPocion(new PocionSimple("Pocion Fortalezedora", 20, true));
		pociones.add(cocktail);
		
		cocktail = new Cocktail();
		cocktail.addPocion(new PocionSimple("Pocion Quiero Vale Cuatro", 4, false));
		cocktail.addPocion(new PocionSimple("Pocion Reductor de Plomo", -55, true));
		cocktail.addPocion(new PocionSimple("Pocion Selectiva Peso", 43, "Peso"));
		pociones.add(cocktail);
		
		//REPARTE POCIONES EN LAS CARTAS
		Collections.shuffle(pociones);
		for (Pocion pocion : pociones) {
			while (!mazo.addPocion(pocion, (int)(Math.random() * mazo.cantCartas()))) {}
		}
		
		//REPARTIR CARTAS
		while (mazo.cantCartas()>0) {
			if (mazo.cantCartas()%2==1) {
				jugador1.addCarta(mazo.darCarta());
				mazo.removeCarta();
			}else {
				jugador2.addCarta(mazo.darCarta());
				mazo.removeCarta();
			}
		}
		
		//JUGAR
		int rondas = 20;
		int ronda=1;
		int turno=1;
		while (jugador1.cantCartas()>0 && jugador2.cantCartas()>0 && rondas>0) {
			String acontecimientos = "----- Ronda "+ ronda+" -----\n";
			String atributoseleccionado;
			if (turno==1) {
				jugador1.cambiarEstrategia();
		        jugador1.seleccionarAtributo();
		        atributoseleccionado = jugador1.getAtributoSeleccionado();
		        acontecimientos+= "el jugador "+jugador1.getNombre()+jugador1.getEstrategia().toString();
			}else {
				jugador2.cambiarEstrategia();
		        jugador2.seleccionarAtributo();
		        atributoseleccionado = jugador2.getAtributoSeleccionado();
		        acontecimientos+= "el jugador "+jugador2.getNombre()+jugador2.getEstrategia().toString();
			}
			acontecimientos+= jugador1.toString();
			Carta cartaj1 = jugador1.darCarta();
			jugador1.removeCarta();
			AtributoDinamico atributoj1 = cartaj1.getAtributo(atributoseleccionado);
			acontecimientos+= atributoj1.toString();
			//pocion cartaj1
			acontecimientos+= ".\n"+jugador2.toString();
			Carta cartaj2 = jugador2.darCarta();
			jugador2.removeCarta();
			AtributoDinamico atributoj2 = cartaj2.getAtributo(atributoseleccionado);
			acontecimientos+= atributoj2.toString();
			//pocion cartaj2
			if (atributoj1.getValorAtributo()>atributoj2.getValorAtributo()) {
				jugador1.addCarta(cartaj1);
				jugador1.addCarta(cartaj2);
				acontecimientos+="\nGana la ronda "+jugador1.getNombre()+" y queda con "+jugador1.cantCartas()+" cartas ("+jugador2.getNombre()+" posee ahora "+jugador2.cantCartas()+" cartas) \n";
				turno=1;
			}else if (atributoj1.getValorAtributo()<atributoj2.getValorAtributo()) {
				jugador2.addCarta(cartaj1);
				jugador2.addCarta(cartaj2);
				acontecimientos+="\nGana la ronda "+jugador2.getNombre()+" y queda con "+jugador2.cantCartas()+" cartas ("+jugador1.getNombre()+" posee ahora "+jugador1.cantCartas()+" cartas) \n";
				turno=2;
			}else {
				jugador1.addCarta(cartaj1);
				jugador2.addCarta(cartaj2);
				acontecimientos+="\nLa ronda termino en empate "+jugador1.getNombre()+" queda con "+jugador1.cantCartas()+" cartas y "+jugador2.getNombre()+" queda con "+jugador2.cantCartas()+" cartas \n";
				if (turno==1) {
					turno=2;
				}else {
					turno=1;
				}
			}
			System.out.println(acontecimientos);
			rondas--;
			ronda++;
		}
		
	}
}
