package Pack;

import java.util.List;

public class Jukebox6 {
	public static void main(String[] args) {
		new Jukebox6().go();
	}
	public void go() {
		List<SongV3> songList = MocksSong.getSongV3();
		System.out.println(songList);
		
		TitleCompare titleCompare = new TitleCompare();
		songList.sort((one, two)-> one.getTitle().compareTo(two.getTitle()));
		System.out.println(songList);
		
		ArtistCompare artistCompare = new ArtistCompare();
		songList.sort((one, two)-> one.getArtist().compareTo(two.getArtist()));
		System.out.println(songList);
		
		
	}
}
