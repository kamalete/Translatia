package proyecto;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class jsonReader {

	public ArrayList<Idioma> leerJSON(String path) {
		JSONParser parser = new JSONParser();
		ArrayList<Idioma> arrayIdiomas = new ArrayList<>();
		try {
			// Leemos el archivo JSON
			Object obj = parser.parse(new FileReader(path));

			// Convertimos el objeto a JSONObject
			JSONObject jsonObject = (JSONObject) obj;

			// Obtenemos la lista de idiomas
			JSONArray idiomas = (JSONArray) jsonObject.get("Idiomas");

			// Recorremos la lista de idiomas
			Iterator<?> iterator = idiomas.iterator();
			while (iterator.hasNext()) {
				// Obtenemos el objeto de idioma actual
				JSONObject idioma = (JSONObject) iterator.next();

				// Recorremos los nombres de idiomas y sus datos correspondientes
				Iterator<?> nombresIdiomas = idioma.keySet().iterator();
				while (nombresIdiomas.hasNext()) {
					String nombreIdioma = (String) nombresIdiomas.next();
					JSONObject datosIdioma = (JSONObject) idioma.get(nombreIdioma);
					Idioma idiomaGuardar = new Idioma();
					idiomaGuardar.setIdioma(nombreIdioma);
					idiomaGuardar.setCode2((String) datosIdioma.get("2"));
					idiomaGuardar.setCode3((String) datosIdioma.get("3"));
					idiomaGuardar.setCode3066((String) datosIdioma.get("3066"));
					idiomaGuardar.setCountry((String) datosIdioma.get("c"));
					arrayIdiomas.add(idiomaGuardar);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arrayIdiomas;
	}

	public ArrayList<Respuesta> leerJSONRespuesta(String path) {
		JSONParser parser = new JSONParser();
		ArrayList<Respuesta> arrayRespuestas = new ArrayList<>();
		try {
			// Leemos el archivo JSON
			Object obj = parser.parse(new FileReader(path));

			// Convertimos el objeto a JSONObject
			JSONObject jsonObject = (JSONObject) obj;

			// Obtenemos la lista de idiomas
			JSONArray responseData = (JSONArray) jsonObject.get("responseData");

			// Recorremos la lista de idiomas
			Iterator<?> iterator = responseData.iterator();
			while (iterator.hasNext()) {
				// Obtenemos el objeto de idioma actual
				JSONObject response = (JSONObject) iterator.next();

				// Recorremos los nombres de idiomas y sus datos correspondientes
				Iterator<?> Data = response.keySet().iterator();
				while (Data.hasNext()) {
					String Datos = (String) Data.next();
					JSONObject datosRespuesta = (JSONObject) response.get(Datos);
					Respuesta respuesta = new Respuesta();
					respuesta.setTranslatedText((String) datosRespuesta.get("translatedText"));
					arrayRespuestas.add(respuesta);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arrayRespuestas;
	}

	public String leerJSONRespuesta2(String path) {
		JSONParser parser = new JSONParser();
		String translatedText = "";
		try {
			Object obj = parser.parse(new FileReader(path));
			JSONObject json = (JSONObject) obj;
			JSONObject responseData = (JSONObject) json.get("responseData");
			translatedText = (String) responseData.get("translatedText");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return translatedText;
	}

}
