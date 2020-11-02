import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class Mazo {

	private ArrayList<Carta> cartas;
	
	public Mazo() {
		this.cartas = new ArrayList<>();
	}
	
	public void cargarMazo(String jsonFile) {
		File jsonInputFile = new File(jsonFile);
        InputStream is;
        try {
            is = new FileInputStream(jsonInputFile);
            // Creo el objeto JsonReader de Json.
            JsonReader reader = Json.createReader(is);
            // Obtenemos el JsonObject a partir del JsonReader.
            JsonArray cartas = (JsonArray) reader.readObject().getJsonArray("cartas");
            for (JsonObject carta : cartas.getValuesAs(JsonObject.class)) {
                Carta creando = new Carta(carta.getString("nombre"));
                JsonObject atributos = (JsonObject) carta.getJsonObject("atributos");
                for (String nombreAtributo:atributos.keySet())
                    creando.addAtributo(nombreAtributo, atributos.getInt(nombreAtributo));
                addCarta(creando);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

	public void removeCarta() {
		cartas.remove(0);
	}
	
	public void addCarta(Carta c) {
		if(cartas.isEmpty()) {
			cartas.add(c);
		}
		else {
			if (chequearCarta(c)) {
				cartas.add(c);
			}
		}
	}
	
	public void abarajar() {
		Collections.shuffle(cartas);
	}
	
	public boolean chequearCarta(Carta c) {
		return c.mismoTipo(cartas.get(0));
	}
	
	public Carta darCarta() {
		return cartas.get(0);
	}
	public int cantCartas() {
		return cartas.size();
	}
}
