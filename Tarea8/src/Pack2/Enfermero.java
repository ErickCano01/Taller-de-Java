package Pack2;

public class Enfermero extends PersonalMedico{
	private String nombre;

	public Enfermero(int numEmpleado, String nombre) {
		super(numEmpleado);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return super.toString()+"\nNombre: " + getNombre();
	}
	

}
