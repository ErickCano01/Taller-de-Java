package Pack;

public class Monedero {
	private int uno;
	private int cinco;
	private int diez;
	private int veinticinco;
	
	private int dinero;
	private float dolares;
	public Monedero(int uno, int cinco, int diez, int veinticinco) {
		this.uno = uno;
		this.cinco = cinco;
		this.diez = diez;
		this.veinticinco = veinticinco;
		setDinero(uno+(cinco*5)+(diez*10)+(veinticinco*25));
	}
	public int getUno() {
		return uno;
	}
	public void setUno(int uno) {
		this.uno = uno;
	}
	public int getCinco() {
		return cinco;
	}
	public void setCinco(int cinco) {
		this.cinco = cinco;
	}
	public int getDiez() {
		return diez;
	}
	public void setDiez(int diez) {
		this.diez = diez;
	}
	public int getVeinticinco() {
		return veinticinco;
	}
	public void setVeinticinco(int veinticinco) {
		this.veinticinco = veinticinco;
	}
	
	public int getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	public float getDolares() {
		return dolares;
	}
	public void setDolares(float dolares) {
		this.dolares = dolares;
	}
	public void depositar(int u, int c, int d, int v) {
		int s;
		s = u+(c*5)+(d*10)+(v*25);
		setDinero(getDinero()+s);
		System.out.println("Dinero depositado: "+s);
	}
	public void retirar(int u, int c, int d, int v) {
		int s;
		s = u+(c*5)+(d*10)+(v*25);
		setDinero(getDinero()-s);
		System.out.println("Dinero retirado: "+s);
	}
	public void  total() {
		float t = getDinero()/100f;
		setDolares(t);
	}
	
	@Override
	public String toString() {
		return "El total en dolares es: "+getDolares()
		+"\nTotal de dinero: "+getDinero();
	}
	
}
