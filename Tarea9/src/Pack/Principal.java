package Pack;

public class Principal {
	public static void main(String[] args) {
		Punto p1 = new Punto();
		Punto p2 = new Punto(4,5);
		Punto p3 = new Punto(4);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo(p2,p1);
		Circulo c3 = new Circulo(p3);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}
}
