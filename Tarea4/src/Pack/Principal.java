package Pack;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//ESTA CLASE ES LA PRINCIPAL Y DONDE DECIDI HACER EL MENU
		Acc c = new Acc();
		int op;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("***MENU***");
		System.out.println("1)Maximo de 2 numeros");
		System.out.println("2)Maximo de 3 numeros");
		System.out.println("3)Maximo de 4 numeros");
		System.out.println("4)Factorial");
		System.out.println("5)numero elevado");
		System.out.println("6)Maximo comun divisor");
		System.out.println("7)Numero flotante a entero");
		System.out.println("8)Primos");
		op = tec.nextInt(); 
		switch(op) {
		case 1:
			c.maximo2();
			break;
		case 2:
			c.maximo3();
			break;
		case 3:
			c.maximo4();
			break;
		case 4:
			c.fact();
			break;
		case 5:
			c.elevado();
			break;
		case 6:
			c.maximoComunDivisor();
			break;
		case 7:
			c.enteroFlotante();
			break;
		case 8:
			c.primos();
			break;
		}
	}
}
