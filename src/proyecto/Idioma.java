package proyecto;

public class Idioma {
	private String idioma;
	private String code2;
	private String code3;
	private String code3066;
	private String country;

	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public String getCode3() {
		return code3;
	}

	public void setCode3(String code3) {
		this.code3 = code3;
	}

	public String getCode3066() {
		return code3066;
	}

	public void setCode3066(String code3066) {
		this.code3066 = code3066;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Idioma [idioma=" + idioma + ", code2=" + code2 + ", code3=" + code3 + ", code3066=" + code3066
				+ ", country=" + country + "]";
	}

	
	
}
