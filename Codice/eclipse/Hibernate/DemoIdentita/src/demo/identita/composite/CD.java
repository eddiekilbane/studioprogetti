package demo.identita.composite;


public class CD implements java.io.Serializable {
	
	private CDCompositeKey key;
	private String company;
	private String country;
	private double price;
	private int year;
	private int quantity;
	
	public CD(){
		key= new CDCompositeKey();
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
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 	"Artista: "+this.key.getArtist()+"\n "+
			   	"Titolo: "+this.key.getTitle()+"\n"+
			   	"Prezzo: "+this.price+"\n"+
			   	"Etichetta: "+this.company+"\n"+
			   	"Paese : "+this.country+"\n"+
			   	"Anno: "+this.year+
			   	"Quantita: "+this.quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getArtist() {
		return key.getArtist();
	}
	public void setArtist(String artist) {
		this.key.setArtist(artist);
	}
	
	public String getTitle() {
		return key.getTitle();
	}
	public void setTitle(String title) {
		this.key.setTitle(title);
	}

	public CDCompositeKey getKey() {
		return key;
	}

	public void setKey(CDCompositeKey key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		
		return this.key.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		return this.key.hashCode()==obj.hashCode();
	}
	


}
