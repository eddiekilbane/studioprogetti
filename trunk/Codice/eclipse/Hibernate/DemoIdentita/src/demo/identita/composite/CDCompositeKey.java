package demo.identita.composite;

public class CDCompositeKey implements java.io.Serializable{

	private String artist;
	private String title;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return artist+" "+title;
	}
	@Override
	public int hashCode() {
		
		return (artist+"*"+title).hashCode();
	}
	@Override
	public boolean equals(Object obj) {		
		return this.hashCode()==obj.hashCode();
	}
	
	
	
	
}
