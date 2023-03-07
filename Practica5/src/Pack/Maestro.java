package Pack;

public class Maestro extends Persona{
	private String facultad;
	private String especialidad;
	private String categoria;
	private boolean maestria;
	private boolean doctorado;
	private boolean licenciatura;
	private int antiguedad;
	
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public boolean isMaestria() {
		return maestria;
	}
	public void setMaestria(boolean maestria) {
		this.maestria = maestria;
	}
	public boolean isDoctorado() {
		return doctorado;
	}
	public void setDoctorado(boolean doctorado) {
		this.doctorado = doctorado;
	}
	public boolean isLicenciatura() {
		return licenciatura;
	}
	public void setLicenciatura(boolean licenciatura) {
		this.licenciatura = licenciatura;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	@Override
	public String toString() {
		
		return super.toString()+"\nFacultad= " + getFacultad() + "\nEspecialidad= " + getEspecialidad()
				+ "\nCategoria= " + getCategoria() + "\nTiene Maestria= " + isMaestria() + "\nTiene Doctorado= "
				+ isDoctorado() + "\nTiene Licenciatura= " + isLicenciatura() + "\nAntiguedad= " + getAntiguedad();
	}
	
	
	
}
