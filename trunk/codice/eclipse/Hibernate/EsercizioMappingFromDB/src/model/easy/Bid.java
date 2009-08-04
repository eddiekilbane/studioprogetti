package model.easy;

import java.io.Serializable;


/**
 * An immutable class representing one bid.
 * <p>
 * Note: This class needs private setter methods for Hibernate. It
 * is mapped as a component of item, hence we can't set "update" to
 * false.
 *
 * @see Item
 * @see User
 * @author Christian Bauer <christian@hibernate.org>
 */
public class Bid implements Serializable, Comparable {

	private Long id = null;
	private Item item;
	private double price;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	Bid() {}

	public Bid(Item item) {
		this.item = item;
	
	}
	
	public Long getId() { return id; }
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Item getItem() { return item; }
	
	public String toString() {
		return  "";
	
	}

	public int compareTo(Object o) {
		
		return 0;
	}


}
