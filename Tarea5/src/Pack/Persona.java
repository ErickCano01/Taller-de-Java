package Pack;

public class Persona {
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private String curp;
	private String rfc;
	private Fecha fecha = new Fecha(19,05,2001);
	private float estatura;
	private float peso;
	
	public Persona(String nombre, String apellidoP, String apellidoM, String curp, String rfc, float estatura, float peso) {
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.curp = curp;
		this.rfc = rfc;
		this.estatura = estatura;
		this.peso = peso;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
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

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String toString() {
		fecha.mostrarFecha();
		return "Nombre: "+getNombre()+" "+getApellidoP()+" "+getApellidoM()
		+"\nCurp: "+getCurp()
		+"\nRFC: "+getRfc()
		+"\nEstatura: "+getEstatura()
		+"\nPeso: "+getPeso();
	}
	
}
