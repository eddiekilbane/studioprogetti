package model.easy;



import java.io.Serializable;
import java.util.*;

/**
 * An item for sale.
 *
 * @author Christian Bauer <christian@hibernate.org>
 *
 */
public class Item implements Serializable {

	private Long id = null;
	private String name;
	private String description;
	private Collection bids = new ArrayList();
	


	/**
	 * No-arg constructor for JavaBean tools.
	 */
	Item() {}

	/**
	 * Full constructor.
	 */
	public Item(String name, String description, List bid) {
		this.name = name;
	
		this.description = description;
		this.bids = bids;
		
	}

	/**
	 * Simple properties only constructor.
	 */
	public Item(String name, String description) {
		this.name = name;
		
		this.description = description;
		
	}

	
	public Long getId() { return id; }
	public String getName() { return name; }
	public String getDescription() { return description; }
	
	public void setDescription(String description) { this.description = description; }
	public Collection getBids() { return bids; }
	public void addBid(Bid bid) {
		if (bid == null)
			throw new IllegalArgumentException("Impossibile aggiungere un Bid null.");
		this.getBids().add(bid);
	}
	public void removeBid(Bid bid) {
		if (bid == null)
			throw new IllegalArgumentException("Impossibile rimuovere un Bid null.");
		this.getBids().remove(bid);
	}

	
	// ********************** Common Methods ********************** //

	public String toString() {
		return  "Item ('" + getId() + "'), " +
				"Name: '" + getName() + "' ";
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBids(Collection bids) {
		this.bids = bids;
	}

	

	// ********************** Business Methods ********************** //

	
	
	

	

}
