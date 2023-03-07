package Pack;

public class Persona {
	private Nombre nombre;
	private Direccion direccion;
	private Telefono tel;
	private Email email;
	
	public Nombre getNombre() {
		return nombre;
	}
	public void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Telefono getTel() {
		return tel;
	}
	public void setTel(Telefono tel) {
		this.tel = tel;
	}
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Nombre: " + getNombre() + "\nDireccion: " + getDireccion() +"\nTelefono: " + getTel()
				+ "\nEmail: " + getEmail();
	}
	
	
}
