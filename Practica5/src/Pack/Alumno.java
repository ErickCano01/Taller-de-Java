package Pack;

import java.util.ArrayList;

public class Alumno extends Persona{
	private String facultad;
	private String carrera;
	private int porcCreditos;
	private int semestre;
	private float prom;
	ArrayList<String> materias = new ArrayList<String>();
	private float[] calf = {88.4f,90f,100f,96.4f,100f};
	
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public int getPorcCreditos() {
		return porcCreditos;
	}
	public void setPorcCreditos(int porcCreditos) {
		this.porcCreditos = porcCreditos;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public float getProm() {
		return prom;
	}
	public void setProm(float prom) {
		this.prom = prom;
	}
	public float[] getCalf() {
		return calf;
	}
	public void setCalf(float[] calf) {
		this.calf = calf;
	}
	public ArrayList<String> getMaterias() {
		return materias;
	}
	public void setMaterias(ArrayList<String> materias) {
		this.materias = materias;
	}
	@Override
	public String toString() {
		return super.toString()+"\nFacultad= " + getFacultad() + "\nCarrera= " + getCarrera() + "\nCreditos= "
				+ getPorcCreditos() + "\nSemestre= " + getSemestre()+ "\nMaterias= " + getMaterias() 
				+ "\nCalificaciones= " + getCalf() + "\nPromedio= " + getProm();
	}

}
