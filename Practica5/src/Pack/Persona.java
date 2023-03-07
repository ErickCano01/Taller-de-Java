package Pack;

public class Persona {
	private String nombre;
	private String fechaNac;
	private String genero;
	private String curp;
	private String rfc;
	private String lugarNac;
	private String telP;
	private String telE;
	private String email;
	private String domicilio;
	private String estCivil;
	private int numIdentificacion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getLugarNac() {
		return lugarNac;
	}
	public void setLugarNac(String lugarNac) {
		this.lugarNac = lugarNac;
	}
	public String getTelP() {
		return telP;
	}
	public void setTelP(String telP) {
		this.telP = telP;
	}
	public String getTelE() {
		return telE;
	}
	public void setTelE(String telE) {
		this.telE = telE;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getEstCivil() {
		return estCivil;
	}
	public void setEstCivil(String estCivil) {
		this.estCivil = estCivil;
	}
	public int getNumIdentificacion() {
		return numIdentificacion;
	}
	public void setNumIdentificacion(int numIdentificacion) {
		this.numIdentificacion = numIdentificacion;
	}
	
	@Override
	public String toString() {
		return "Nombre= " + getNombre() + "\nFechad de nacimiento= " + getFechaNac() + "\nGenero= "
				+ getGenero() + "\nCURP= " + getCurp() + "\nRFC= " + getRfc() + "\nLugar de Nacimiento= "
				+ getLugarNac() + "\nTelefomo Persomal= " + getTelP() + "\nTelefono de Emergencia= " + getTelE() + "\nEmail= " + getEmail()
				+ "\nDomicilio= " + getDomicilio() + "\nEstado Civil= " + getEstCivil()
				+ "\nNumero de Identificacion= " + getNumIdentificacion() + "]";
	}
	
}
