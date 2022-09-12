package Pack;

import java.util.Scanner;

public class Acc {
	Scanner tec = new Scanner(System.in);
	Pedido c = new Pedido();
	
	//Funciones requeridas
	public void promedio() {
		c.setN(5);
		int i;
		float s = 0,p;
		for(i=0;i<5;i++) {
			System.out.println("Ingrese la calificacion: ");
			c.setN(tec.nextFloat());
			s+= c.getN();
		}
		p = s/5;
		System.out.println("El promedio es: "+p);
	}
	public void sumatoria() {
		int i = 1,s = 0;
		System.out.println("Ingrese el numero limite de la sumatoria: ");
		c.setNum(tec.nextInt());
		while(i<=c.getNum()) {
			s+= i;
			i++;
		}
		System.out.println("Sumatoria = "+s);
	}
	public void fibonacci() {
		int i,s=1,n1=0,n2=1;
		System.out.println("Ingrese el rango de la serie Fibonacci: ");
		c.setNum(tec.nextInt());
		System.out.print(n1+" ");
		for(i=1;i<c.getNum();i++) {
			System.out.print(s+" ");
			s = n1 + n2;
			n1 = n2;
			n2 = s;
		}
	}
	public void primos() {
		System.out.println("Ingrese el rango: ");
		c.setNum(tec.nextInt());
		
		for(int i=1; i<=c.getNum();i++) {
			if(prim(i)== true) {
				System.out.print(i+" ");
			}
		}
	}
	
	
	//Funciones aparte
	
	public static boolean prim(int n) {
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
}
