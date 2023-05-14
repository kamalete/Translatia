package proyecto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapLanguages {

	public Map<String, String> Mapear() {
		String path = "E:\\JSONFiles\\languages.JSON";
		jsonReader jsonReader = new jsonReader();
		ArrayList<Idioma> idiomas = jsonReader.leerJSON(path);
		Map<String, String> mapLanguages = new HashMap<String, String>();
		for (Idioma idioma : idiomas) {
			mapLanguages.put(idioma.getCountry(), idioma.getCode2());
		}
		return mapLanguages;

	}

}
