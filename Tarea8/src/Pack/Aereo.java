package Pack;

abstract public class Aereo extends Vehiculos{
	private int kmVolados;

	public Aereo(String color, String marca, int kmVolados) {
		super(color, marca);
		this.kmVolados = kmVolados;
	}

	public int getKmVolados() {
		return kmVolados;
	}

	public void setKmVolados(int kmVolados) {
		this.kmVolados = kmVolados;
	}

	@Override
	public String toString() {
		return super.toString()+" \nKm volados: " + getKmVolados();
	}
}
