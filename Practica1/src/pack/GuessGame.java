package pack;

public class GuessGame {
	public void startGame() {
		//Esto lo puse asi por que me gusta mas asi
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int tnumber = (int)(Math.random()*10);
		System.out.println("Estoy pensando en un numero...");
		System.out.println("Numero Elegido: "+tnumber);
		
		while(true) {
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("Jugador 1: "+guessp1);
			guessp2 = p2.number;
			System.out.println("Jugador 2: "+guessp2);
			guessp3 = p3.number;
			System.out.println("Jugador 3: "+guessp3);
			
			if(guessp1 == tnumber) {
				p1isRight = true;
			}
			if(guessp2 == tnumber) {
				p2isRight = true;
			}
			if(guessp3 == tnumber) {
				p3isRight = true;
			}
			
			if(p1isRight || p2isRight || p3isRight) {
				System.out.println("Tenemos un ganador!!!");
				System.out.println("Jugador 1: "+p1isRight);
				System.out.println("Jugador 2: "+p2isRight);
				System.out.println("Jugador 3: "+p3isRight);
				System.out.println("Game is Over");
				break;
			}else {
				System.out.println("No tenemos ningun ganador, Sigue intentando");
			}
		}
	}
}
