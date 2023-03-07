package Pack;

public class SongV4 implements Comparable<SongV4>{
	private String title, artist;
	private int bpm;
	
	public boolean equals(Object aSong) {
		SongV4 other = (SongV4) aSong;
		return title.equals(other.getTitle());
	}
	
	public int hashCode() {
		return title.hashCode();
	}
	public int compareTo(SongV4 s) {
		return title.compareTo(s.getTitle());
	}

	public SongV4(String title, String artist, int bpm) {
		super();
		this.title = title;
		this.artist = artist;
		this.bpm = bpm;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getBpm() {
		return bpm;
	}

	public void setBpm(int bpm) {
		this.bpm = bpm;
	}
	@Override
	public String toString() {
		return title;
	}
}
