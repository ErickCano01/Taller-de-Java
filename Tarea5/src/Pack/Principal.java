package Pack;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int op;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("***MENU***");
		System.out.println("1)Clase Monedero");
		System.out.println("2)Clase Fecha");
		System.out.println("3)Clase Persona");
		System.out.println("4)Clase Punto");
		op = tec.nextInt();
		switch(op) {
		case 1:
			//Uno/Cinco/Diez/veinticinco --cada numero es la cantidad de monedas
			Monedero p1 = new Monedero(5,2,1,2);
			System.out.println("Dinero puesto: "+p1.getDinero());
			p1.depositar(1, 1, 0, 0);
			p1.retirar(1, 0, 0, 0);
			System.out.println("---------");
			System.out.println(p1);
			break;
		case 2:
			Fecha p2 = new Fecha(19,05,2001);
			p2.mostrarFecha();
			break;
		case 3:
			Persona p3 = new Persona("Erick","Cano","Osorio","CAOE","CAERFC",1.81f,120f);
			System.out.println(p3);
			break;
		case 4:
			Punto p4 = new Punto(50,50);
			p4.mover(-30, -20);
			System.out.println(p4);
			break;
		}
	}
}
