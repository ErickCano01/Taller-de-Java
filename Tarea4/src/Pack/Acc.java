package Pack;

import java.util.Scanner;

public class Acc {
	//ESTA CLASE TIENE TODAS LAS ACCIONES DEL PROGRAMA
	Scanner tec = new Scanner(System.in);
	Pedido c = new Pedido();
	
	//FUNCIONES LLAMADAS DE LA CLASE PRINCIPAL
	public void maximo2() {
		int a,b,s;
		System.out.println("MAXIMO DE 2 NUMEROS \n");
		a = pedir();
		b = pedir();
		s = max(a,b);
		System.out.println("El numero mayor es: "+s);
	}
	public void maximo3() {
		int a,b,c,s;
		System.out.println("MAXIMO DE 3 NUMEROS \n");
		a = pedir();
		b = pedir();
		c = pedir();
		s = max(a,b,c);
		System.out.println("El numero mayor es: "+s);
	}
	public void maximo4() {
		int a,b,c,d,s;
		System.out.println("MAXIMO DE 4 NUMEROS \n");
		a = pedir();
		b = pedir();
		c = pedir();
		d = pedir();
		s = max(a,b,c,d);
		System.out.println("El numero mayor es: "+s);
	}
	public void fact() {
		int a,s;
		a = pedir();
		s = factorial(a);
		System.out.println("El factorial es: "+s);
	}
	public void elevado() {
		int a,b,s;
		System.out.println("Valor al que se le va a elevar");
		a = pedir();
		System.out.println("Valor que va elevar");
		b = pedir();
		s = pow(a,b);
		System.out.println("El resultado es: "+s);
	}
	public void maximoComunDivisor() {
		int a,b,s;
		a = pedir();
		b = pedir();
		s = mcd(a,b);
		System.out.println("El maximo comun divisor: "+s);
	}
	public void enteroFlotante() {
		float a;
		int s;
		a = pedirF();
		s = round(a);
		System.out.println("El numero es: "+s);
	}
	public void primos() {
		int a;
		boolean s;
		a = pedir();
		s = isPrime(a);
		System.out.println("El numero "+a+" es "+s);
		
	}
	
	//FUNCIONES PEDIDAS
	public int max(int a, int b) {
		//HICE QUE NO HICIERA NADA SI RECIBE 2 NUMEROS IGUALES POR QUE NO ME PARECE NECESARIO
		int s;
		if(a>b) {
			s = a;
		}else {
			s = b;
		}
		return s;
	}
	public int max(int a, int b, int c) {
		//HICE QUE NO HICIERA NADA SI RECIBE 2 NUMEROS IGUALES POR QUE NO ME PARECE NECESARIO
		int s = 0;
		
		if(a>b && a>c) {
			s = a;
		}else if(b>a && b>c) {
			s = b;
		}else if(c>a && c>b) {
			s = c;
		}
		return s;
	}
	
	public int max(int a, int b, int c, int d) {
		//HICE QUE NO HICIERA NADA SI RECIBE 2 NUMEROS IGUALES POR QUE NO ME PARECE NECESARIO
		int s=0;
		if(a>b && a>c && a>d) {
			s = a;
		}else if(b>a && b>c && b>d) {
			s = b;
		}else if(c>a && c>b && c>d) {
			s = c;
		}else if(d>a && d>b && d>c){
			s = d;
		}
		return s;
	}
	public int factorial(int a) {
		int s=a,i=1;
		for(i=1;i<a;i++) {
			s = s * i;
		}
		return s;
	}
	public int pow(int x, int y) {
		//ME DIO FLOJERA HACERLO MANUAL ASI QUE LO HICE CON MATH
		int s;
		s = (int) Math.pow(x, y);
		return s;
	}
	public int mcd(int a, int b) {
		int s=0;
		while(b != 0) {
			s = b;
			b = a % b;
			a = s;
		}
		return a;
	}
	public int round(float a) {
		int s;
		float t;
		s = (int) Math.floor(a);
		t = a - s;
		if(t>=0.60) {
			s = (int) Math.round(a);
		}else {
			s = (int) Math.floor(a);
		}
		return s;
		
	}
	public static boolean isPrime(int n) {
		//ESTE METODO LO RECICLE DE LA TAREA 2
		if(n<= 1) {
			return false;
		}else if(n == 2) {
			return true;
		}else {
			for(int i = 2; i<n;i++) {
				if(n% i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	//PEDIDA DE DATOS
	public int pedir() {
		System.out.println("Ingrese un numero");
		c.setNum(tec.nextInt());
		return c.getNum();
	}
	public float pedirF() {
		System.out.println("Ingrese un numero");
		c.setN(tec.nextFloat());
		return c.getN();
	}
}
