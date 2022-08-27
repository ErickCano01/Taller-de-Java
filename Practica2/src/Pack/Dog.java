package Pack;

public class Dog {
	String name;
	public static void main(String [] args) {
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
		int n=3;//Esto solo lo puse por si en algun momento se llega a cambiar
		Dog[] myDogs = new Dog[n];
		int i=0;
		
		while(i<myDogs.length){//Esto es por lo mismo de arriba que es por si se llega a cambiar
			myDogs[i] = new Dog();
			i++;
		}
		myDogs[2] = dog1;
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		System.out.println("El nombre de mi ultimo perro es: "+myDogs[2].name);
		i=0;
		while(i<myDogs.length) {
			myDogs[i].bark();
			i++;
		}
		
	}
	public void bark() {
		System.out.println(name+" dice Ruff!");
	}
	public void eat() {
		System.out.println(name+" esta comiendo");
	}
	public void chasecat() {
		System.out.println(name+" esta persiguiendo un gato");
		
	}
}
