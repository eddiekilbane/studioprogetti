package demo.myapp.domain;

 
public class CD implements java.io.Serializable {
	
	private Long PrimaryKey;
	private String artist;
	private String company;
	private String country;
	private double price;
	private String title;
	private int year;
	private int quantity;
	
	public CD(){
		
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Long getPrimaryKey() {
		return PrimaryKey;
	}
	public void setPrimaryKey(Long primaryKey) {
		PrimaryKey = primaryKey;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 	"ID: "+this.getPrimaryKey()+"\n "+
				"Artista: "+this.getArtist()+"\n "+
			   	"Titolo: "+this.getTitle()+"\n"+
			   	"Prezzo: "+this.getPrice()+"\n"+
			   	"Etichetta: "+this.getCompany()+"\n"+
			   	"Paese : "+this.getCountry()+"\n"+
			   	"Anno: "+this.getYear()+"\n "+
			   	"Quantita: "+this.getQuantity();
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	


}
