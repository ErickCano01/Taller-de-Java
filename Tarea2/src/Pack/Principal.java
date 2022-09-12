package Pack;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Acc c = new Acc();
		int op;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("***MENU***");
		System.out.println("1)Promedio");
		System.out.println("2)Sumatoria");
		System.out.println("3)Fibonacci");
		System.out.println("4)Numeros primos");
		op = tec.nextInt(); 
		switch(op) {
		case 1:
			c.promedio();
			break;
		case 2:
			c.sumatoria();
			break;
		case 3:
			c.fibonacci();
			break;
		case 4:
			c.primos();
			break;
		default:
			System.out.println("Esa opcion no existe");
			break;
		}
	}
}
