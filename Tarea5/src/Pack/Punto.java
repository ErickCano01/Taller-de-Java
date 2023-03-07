package Pack;

public class Punto {
	private int x;
	private int y;
	
	private final int MAX_X=100;
	private final int MAX_Y=100;
	private final int MIN_X=-100;
	private final int MIN_Y=-100;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
		validar();
		System.out.println("Inicialmente estas en: "+getX()+","+getY());
	}

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
	
	public void mover(int x, int y) {
		if((getX()+x>MAX_X || getY()+y>MAX_Y)||(getX()+x<MIN_X || getY()+y<MIN_Y)) {
			System.out.println("ERROR: EL LIMITE SE SOBREPASO, No se genero ningun cambio");
		}else {
			setX(getX()+x);
			setY(getY()+y);
			System.out.println("Te moviste con EXITO");
		}
	}
	public void validar() {
		if((getX()>MAX_X || getY()>MAX_Y)||(getX()<MIN_X || getY()<MIN_Y)) {
			System.out.println("ERROR: EL LIMITE SE SOBREPASO");
			System.exit(0);
		}
	}
	public String toString() {
		System.out.println("--------------------------");
		return "Te encuentras aqui: "+getX()+","+getY();
	}
}
