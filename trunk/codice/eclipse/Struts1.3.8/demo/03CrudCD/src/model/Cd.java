package model;

public class Cd {

	/**
	 * @param args
	 */

	private long primary;
	private String artist;
	private String company;
	private String country;
	private double	price;
	private String title;
	private int year;
	private int quantity;
	
	public Cd(long primary, String artist, String company, double price, String title, String country, int year, int q) {
		super();
		this.primary = primary;
		this.artist = artist;
		this.company = company;
		this.country = country;
		this.price = price;
		this.title = title;
		this.year = year;
		this.quantity=q;
	}

	public Cd() {
		
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

	public long getPrimary() {
		return primary;
	}

	public void setPrimary(long primary) {
		this.primary = primary;
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
	
	public String toString(){
		
		return 	"Artista:\t"+ this.artist+"\n"+
				"Titolo:\t"+ this.title+"\n"+
				"Prezzo:\t"+ this.price+"\n"+
				"Etichetta:\t"+ this.company+"\n"+
				"Paese:\t"+ this.country+"\n"+
				"Anno:\t"+ this.year+"\n"+
				"Quantita:\t"+ this.quantity+"\n";
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	
}
