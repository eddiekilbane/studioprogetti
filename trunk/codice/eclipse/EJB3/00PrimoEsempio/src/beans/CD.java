package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="cd")
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
	
	@Column(name="Artista")
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Column(name="Etichetta")
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Column(name="Nazione")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name="Prezzo")
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Id
	@GeneratedValue
	@Column(name="idCd")
	public Long getPrimaryKey() {
		return PrimaryKey;
	}
	public void setPrimaryKey(Long primaryKey) {
		PrimaryKey = primaryKey;
	}
	
	@Column(name="Titolo")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Column(name="Anno")
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
	
	@Column(name="Quantita")
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	


}
