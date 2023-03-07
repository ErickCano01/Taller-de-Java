package Pack;

public class Punto {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Punto(int x) {
		super();
		this.x = x;
	}
	
	public Punto() {
		
	}
	@Override
	public String toString() {
		return "x = " + getX() + " y = " + getY();
	}
	
	
}
