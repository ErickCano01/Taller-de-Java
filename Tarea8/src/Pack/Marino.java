package Pack;

abstract public class Marino extends Vehiculos{
	private int kmNavegados;

	public Marino(String color, String marca, int kmNavegados) {
		super(color, marca);
		this.kmNavegados = kmNavegados;
	}

	public int getKmNavegados() {
		return kmNavegados;
	}

	public void setKmNavegados(int kmNavegados) {
		this.kmNavegados = kmNavegados;
	}

	@Override
	public String toString() {
		return super.toString()+"\nKilometros navegados: " + getKmNavegados();
	}
	

}
