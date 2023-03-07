package Pack;

public class Circulo {
	private Punto radio;
	private Punto centro;
	public Punto getRadio() {
		return radio;
	}
	public void setRadio(Punto radio) {
		this.radio = radio;
	}
	public Punto getCentro() {
		return centro;
	}
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	
	public Circulo(Punto radio, Punto centro) {
		super();
		this.radio = radio;
		this.centro = centro;
	}
	public Circulo(Punto radio) {
		super();
		this.radio = radio;
	}
	public Circulo() {
		
	}
	@Override
	public String toString() {
		return "Radio: " + getRadio() + " Centro: " + getCentro();
	}
	
	
}
