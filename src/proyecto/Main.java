package proyecto;

public class Main {
	
	public static void main(String[] args) {
		String path = "E:\\JSONFiles\\languages.JSON";
		String pathDemo = "E:\\JSONFiles\\languagesDemo.JSON";
		String path4 = "E:\\JSONFiles\\response.json";
		jsonReader lector = new jsonReader();
//		System.out.println(lector.leeJson(path));
//		System.out.println(lector.leerJSON(pathDemo));
//		System.out.println(lector.leerJSON(path));
//		System.out.println(lector.leerJSONRespuesta(path4));
		System.out.println(lector.leerJSONRespuesta2(path4));
//		MapLanguages map = new MapLanguages();
	}
}