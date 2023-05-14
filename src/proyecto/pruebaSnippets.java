package proyecto;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class pruebaSnippets {
	public static void main(String[] args) {
//		Hello%20my%20name%20is%20Francisco
		TransformadorURL url = new TransformadorURL();
		String mensajeSinTransformar = "Hello my name is Francisco";
		MapLanguages mapaLenguages = new MapLanguages();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://translated-mymemory---translation-memory.p.rapidapi.com/get?langpair="
						+ mapaLenguages.Mapear().get("GB") + "%7C" + mapaLenguages.Mapear().get("ES") + "&q=" + url.receiver(mensajeSinTransformar)
						+ "&mt=1&onlyprivate=0&de=a%40b.c"))
				.header("X-RapidAPI-Host", "translated-mymemory---translation-memory.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody()).build();
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(url.receiver("Hello%20my%20name%20is%20Francisco"));
		System.out.println(response.body());
	}

}
