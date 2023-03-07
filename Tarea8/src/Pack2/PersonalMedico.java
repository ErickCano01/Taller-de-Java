package Pack2;

abstract public class PersonalMedico {
	private int NumEmpleado;

	public PersonalMedico(int numEmpleado) {
		super();
		NumEmpleado = numEmpleado;
	}

	public int getNumEmpleado() {
		return NumEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		NumEmpleado = numEmpleado;
	}

	@Override
	public String toString() {
		return "Numero de Empleado: " + getNumEmpleado();
	}
}
