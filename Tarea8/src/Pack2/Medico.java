package Pack2;

public class Medico extends PersonalMedico{
	private String nombre;

	public Medico(int NumEmpleado,String nombre) {
		super(NumEmpleado);
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
