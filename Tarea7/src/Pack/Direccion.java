package Pack;

public class Direccion {
	private String calle;
	private String numExterior;
	private String numInterior;
	private String colonia;
	private String codPostal;
	private String ciudad;
	private String estado;
	private String pais;
	
	public Direccion(String calle, String numExterior, String numInterior, String colonia, String codPostal,
			String ciudad, String estado, String pais) {
		super();
		this.calle = calle;
		this.numExterior = numExterior;
		this.numInterior = numInterior;
		this.colonia = colonia;
		this.codPostal = codPostal;
		this.ciudad = ciudad;
		this.estado = estado;
		this.pais = pais;
	}
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumExterior() {
		return numExterior;
	}
	public void setNumExterior(String numExterior) {
		this.numExterior = numExterior;
	}
	public String getNumInterior() {
		return numInterior;
	}
	public void setNumInterior(String numInterior) {
		this.numInterior = numInterior;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	@Override
	public String toString() {
		return "Calle: " + getCalle() + " Numero Exterior: " + getNumExterior() + " Numero Interior: "
				+ getNumInterior() + " Colonia: " + getColonia() + " Codigo Postal: " + getCodPostal()
				+ " Ciudad: " + getCiudad() + " Estado: " + getEstado() + " Pais: " + getPais();
	}
	
	
}
