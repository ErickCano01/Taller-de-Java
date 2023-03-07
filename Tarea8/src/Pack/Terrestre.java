package Pack;

abstract public class Terrestre extends Vehiculos{
	private int kmRecorridos;

	public Terrestre(String color, String marca, int kmRecorridos) {
		super(color, marca);
		this.kmRecorridos = kmRecorridos;
	}

	public int getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	@Override
	public String toString() {
		return super.toString()+"\nKilometros Recorridos: " + getKmRecorridos();
	}
	
	
}
