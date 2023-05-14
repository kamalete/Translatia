package proyecto;

public class TransformadorURL {

	public String receiver(String mensajeSinTransformacion) {
			String mensajeTransformado = mensajeSinTransformacion.replaceAll(" ", "%20");
		return mensajeTransformado;
	}
}
