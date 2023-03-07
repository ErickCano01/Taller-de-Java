package Pack;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Jukebox3 {
	public static void main(String[] args) {
		new Jukebox2().go();
	}
	
	public void go() {
		
		List<SongV3> songList = MocksSong.getSongV3();
		System.out.println(songList);
		
		//Collections.sort(songList);
		//System.out.println(songList);
		
	}
}

