package Pack;

import java.util.ArrayList;
import java.util.List;

public class MocksSong {
	
	public static List<SongV4> getSongV4(){
		
		List<SongV4> songs = List.of(
				new SongV4("Somersault","zero 7", 147),
				new SongV4("cassidy","grateful dead", 158),
				new SongV4("$10", "hitchhiker", 140));
		
		return songs;
		
	}
}
