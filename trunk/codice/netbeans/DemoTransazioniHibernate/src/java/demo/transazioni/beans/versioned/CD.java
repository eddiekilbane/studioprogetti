package demo.transazioni.beans.versioned;


public class CD implements java.io.Serializable {
	
	private Long PrimaryKey;
	private String artist;
	private String company;
	private String country;
	private double price;
	private String title;
	private int year;
	private int quantity;
    private int version;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
	
	public CD(){
		
	}
    public void setNull(){

        this.PrimaryKey=0L;
        this.artist="";
        this.company="";
        this.country="";
        this.price=0.0;
        this.quantity=0;
        this.title="";
        this.year=0;

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
		return 	"Artista: "+this.artist+"\n "+
			   	"Titolo: "+this.title+"\n"+
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

	


}
