package model.beans;



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
	private int version;
	private String name;
	private User seller;
	private String description;
	private Set categorizedItems = new HashSet();
	private Collection bids = new ArrayList();
	


	/**
	 * No-arg constructor for JavaBean tools.
	 */
	Item() {}

	/**
	 * Full constructor.
	 */
	public Item(String name, String description, User seller,
				Set categories, List bids, Bid successfulBid) {
		this.name = name;
		this.seller = seller;
		this.description = description;
		this.categorizedItems = categories;
		this.bids = bids;
		
	}

	/**
	 * Simple properties only constructor.
	 */
	public Item(String name, String description, User seller) {
		this.name = name;
		this.seller = seller;
		this.description = description;
		
	}

	// ********************** Accessor Methods ********************** //

	public Long getId() { return id; }

	public String getName() { return name; }
	public User getSeller() { return seller; }

	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }

	

	public Set getCategorizedItems() { return categorizedItems; }
	
	public void addCategorizedItem(CategorizedItem catItem) {
		if (catItem == null)
			throw new IllegalArgumentException("Can't add a null CategorizedItem.");
		this.getCategorizedItems().add(catItem);
	}

	public Collection getBids() { return bids; }
	
	
	public void addBid(Bid bid) {
		if (bid == null)
			throw new IllegalArgumentException("Can't add a null Bid.");
		this.getBids().add(bid);
	}

	

	


	
	

	
	// ********************** Common Methods ********************** //

	public String toString() {
		return  "Item ('" + getId() + "'), " +
				"Name: '" + getName() + "' ";
	}

	

	// ********************** Business Methods ********************** //

	
	
	

	

}
