package model.beans;

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
	private User bidder;
	

	/**
	 * No-arg constructor for JavaBean tools.
	 */
	Bid() {}

	/**
	 * Full constructor.
	 *
	 * @param amount
	 * @param item
	 * @param bidder
	 */

	public Bid(Item item, User bidder) {
		this.item = item;
		this.bidder = bidder;
	}

	// ********************** Accessor Methods ********************** //

	public Long getId() { return id; }

	
	public Item getItem() { return item; }
	public User getBidder() { return bidder; }

	// ********************** Common Methods ********************** //

	

	

	public String toString() {
		return  "";
	
	}

	public int compareTo(Object o) {
		
		return 0;
	}

	// ********************** Business Methods ********************** //


}
