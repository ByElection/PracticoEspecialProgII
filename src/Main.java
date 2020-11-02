import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//CARGA EL MAZO
		String mazoPath = "./superheroes.json";
		Mazo mazo = new Mazo();
		mazo.cargarMazo(mazoPath);
		//CREA LOS JUGADORES
		System.out.println("escriba el nombre del jugador 1: ");
		Scanner scan = new Scanner(System.in);
		String jugador = scan.next();
		scan.close();
		Jugador jugador1 = new Jugador(jugador);
		System.out.println("escriba el nombre del jugador 2: ");
		scan = new Scanner(System.in);
		jugador = scan.next();
		scan.close();
		Jugador jugador2 = new Jugador(jugador);
		
		//CREA POCIONES A LOS JUGADORES
		jugador1.addPocion(new PocionSimple("Pocion Fortalezedora", 20, true));
		jugador2.addPocion(new PocionSimple("Pocion Fortalezedora", 20, true));

		jugador1.addPocion(new PocionSimple("Pocion Fortalezedora", 10, true));
		jugador2.addPocion(new PocionSimple("Pocion Fortalezedora", 10, true));

		jugador1.addPocion(new PocionSimple("Pocion Fortalezedora Plus", 50, true));
		jugador2.addPocion(new PocionSimple("Pocion Fortalezedora Plus", 50, true));

		jugador1.addPocion(new PocionSimple("Pocion Fortalezedora Plus", 60, true));
		jugador2.addPocion(new PocionSimple("Pocion Fortalezedora Plus", 60, true));
		
		jugador1.addPocion(new PocionSimple("Pocion Kriptonita", -25, true));
		jugador2.addPocion(new PocionSimple("Pocion Kriptonita", -25, true));

		jugador1.addPocion(new PocionSimple("Pocion Kriptonita", -20, true));
		jugador2.addPocion(new PocionSimple("Pocion Kriptonita", -20, true));

		jugador1.addPocion(new PocionSimple("Pocion Reductor de Plomo", -55, true));
		jugador2.addPocion(new PocionSimple("Pocion Reductor de Plomo", -55, true));

		jugador1.addPocion(new PocionSimple("Pocion Reductor de Plomo", -50, true));
		jugador2.addPocion(new PocionSimple("Pocion Reductor de Plomo", -50, true));

		jugador1.addPocion(new PocionSimple("Pocion Quiero Vale Cuatro", 4, false));
		jugador2.addPocion(new PocionSimple("Pocion Quiero Vale Cuatro", 4, false));

		jugador1.addPocion(new PocionSimple("Pocion Quiero Vale Cinco", 5, false));
		jugador2.addPocion(new PocionSimple("Pocion Quiero Vale Cinco", 5, false));

		jugador1.addPocion(new PocionSimple("Pocion Numero Magico", 23, false));
		jugador2.addPocion(new PocionSimple("Pocion Numero Magico", 23, false));

		jugador1.addPocion(new PocionSimple("Pocion Numero Magico", 32, false));
		jugador2.addPocion(new PocionSimple("Pocion Numero Magico", 32, false));

		jugador1.addPocion(new PocionSimple("Pocion Selectiva Fuerza.", 35, "Fuerza"));
		jugador2.addPocion(new PocionSimple("Pocion Selectiva Fuerza.", 35, "Fuerza"));

		jugador1.addPocion(new PocionSimple("Pocion Selectiva Fuerza", 40, "Fuerza"));
		jugador2.addPocion(new PocionSimple("Pocion Selectiva Fuerza", 40, "Fuerza"));

		jugador1.addPocion(new PocionSimple("Pocion Selectiva Peso", 43, "Peso"));
		jugador2.addPocion(new PocionSimple("Pocion Selectiva Peso", 43, "Peso"));

		jugador1.addPocion(new PocionSimple("Pocion Selectiva Peso", 50, "Peso"));
		jugador2.addPocion(new PocionSimple("Pocion Selectiva Peso", 50, "Peso"));
		
		//CREA Y AGREGA COCKTAILS
		Cocktail cocktail = new Cocktail();
		cocktail.addPocion(new PocionSimple("Pocion Selectiva Fuerza.", 35, "Fuerza"));
		cocktail.addPocion(new PocionSimple("Pocion Fortalezedora", 20, true));
		try {
			jugador1.addPocion((Cocktail)cocktail.clone());
			jugador2.addPocion((Cocktail)cocktail.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cocktail = new Cocktail();
		cocktail.addPocion(new PocionSimple("Pocion Quiero Vale Cuatro", 4, false));
		cocktail.addPocion(new PocionSimple("Pocion Reductor de Plomo", -55, true));
		cocktail.addPocion(new PocionSimple("Pocion Selectiva Peso", 43, "Peso"));
		try {
			jugador1.addPocion((Cocktail)cocktail.clone());
			jugador2.addPocion((Cocktail)cocktail.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
