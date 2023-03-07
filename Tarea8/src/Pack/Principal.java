package Pack;

public class Principal {
	public static void main(String[] args) {
		//Aereos
		Helicoptero h1 = new Helicoptero("Gris","Pegasso",80,"Rapido");
		Avion a1 = new Avion("Blanco","palop",100);
		Avioneta av1 = new Avioneta("Blanco","peliagudo",100);
		Dirigible d1 = new Dirigible("Rojo","tt",10);
		
		System.out.println("Aereos\n");
		System.out.println("Helicoptero\n"+h1);
		System.out.println("\nAvion\n"+a1);
		System.out.println("\nAvioneta\n"+av1);
		System.out.println("\nDirigible\n"+d1);
		System.out.println("-----------------");
		
		//Terrestres
		Carro c1 = new Carro("Verde","Nissan",200);
		Camioneta ca1 = new Camioneta("Negro","Suburban",150);
		Tractor t1 = new Tractor("Cafe","plarg",20);
		Tren tr1 = new Tren("Negro","thomas",1500);
		
		System.out.println("Terrestre\n");
		System.out.println("\nCarro:\n"+c1);
		System.out.println("\nCamioneta:\n"+ca1);
		System.out.println("\nTractor\n"+t1);
		System.out.println("\nTren\n"+tr1);
		
		//Marinos
		Barco b1 = new Barco("Blanco","Marin",60);
		Lancha l1 = new Lancha("Blanco","Marin",0);
		Submarino s1 = new Submarino("Negro","let",50);
		
		System.out.println("Marinos\n");
		System.out.println("\nBarco\n"+b1);
		System.out.println("\nLancha\n"+l1);
		System.out.println("\nSubmarino\n"+s1);
		
		
	}
}
