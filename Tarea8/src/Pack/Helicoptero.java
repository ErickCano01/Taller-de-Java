package Pack;

public class Helicoptero extends Aereo{
	private String velocidad;

	public Helicoptero(String color, String marca, int kmVolados, String velocidad) {
		super(color, marca, kmVolados);
		this.velocidad = velocidad;
	}

	public String getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return super.toString()+" \nVelocidad: " + getVelocidad();
	}
	
	
}
