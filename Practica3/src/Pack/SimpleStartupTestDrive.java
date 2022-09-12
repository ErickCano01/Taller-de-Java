package Pack;

import java.util.ArrayList;

public class SimpleStartupTestDrive {
	public static void main(String[] args) {
		int numOfGuesses = 0;
		ArrayList locations = new ArrayList();
		GameHelper helper = new GameHelper();
		
		SimpleStartup dot = new SimpleStartup();
		int randomNum = (int) (Math.random()*5);
		for(int i = 0;i<3;i++) {
			locations.add(randomNum+i);
			System.out.println(i);
		}
		System.out.println(locations);
		dot.setLocationCells(locations);
		boolean isAlive = true;
		
		while(isAlive) {
			int guess = helper.getUserInput("Introduce un numero");
			String result = dot.checkYourself(guess);
			numOfGuesses++;
			if(result.equals("kill")) {
				isAlive = false;
				System.out.println("te tomo "+ numOfGuesses + " intentos");
			}
		}
	}
}
