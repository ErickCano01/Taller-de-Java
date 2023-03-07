package Pack;

import java.util.*;

public class Jukebox2 {
	public static void main(String[] args) {
		new Jukebox2().go();
	}
	
	public void go() {
		
		List<SongV3> songList = MocksSong.getSongV3();
		System.out.println(songList);
	}
}
