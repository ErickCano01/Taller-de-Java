package Pack;

import java.util.ArrayList;

public class SimpleStartup {
	private ArrayList<Integer> locationCells;
	
	public void setLocationCells(ArrayList<Integer> locs) {
		locationCells = locs;
	}
	public String checkYourself(int guess) {
		
		int index = locationCells.indexOf(guess);
		String result = "miss";
		if(index >= 0) {
			locationCells.remove(index);
			if(locationCells.isEmpty()) {
				result = "kill";
			}else {
				result = "hit";
			}
		}
		System.out.println(result);
		return result;
	}
}
