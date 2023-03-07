package Pack;

public class Telefono {
	private String codPais;
	private String codArea;
	private String numTel;
	
	public Telefono(String codPais, String codArea, String numTel) {
		super();
		this.codPais = codPais;
		this.codArea = codArea;
		this.numTel = numTel;
	}
	
	public String getCodPais() {
		return codPais;
	}
	public void setCodPais(String codPais) {
		this.codPais = codPais;
	}
	public String getCodArea() {
		return codArea;
	}
	public void setCodArea(String codArea) {
		this.codArea = codArea;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	
	@Override
	public String toString() {
		return getCodPais()+" "+ getCodArea()
				+ getNumTel();
	}
	
}
