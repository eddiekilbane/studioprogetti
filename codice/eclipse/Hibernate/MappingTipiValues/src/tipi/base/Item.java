package tipi.base;


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

	
	


	/**
	 * No-arg constructor for JavaBean tools.
	 */
	Item() {}

	

	// ********************** Accessor Methods ********************** //

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	// ********************** Common Methods ********************** //

	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Item)) return false;

		final Item item = (Item) o;

		if ( (this.name.equals(item.name) ) && (this.description.equals(item.description)) ) return true;
		else return false;
	}

	public int hashCode() {
		
		return (this.name+"00"+this.description).hashCode();
	}

	public String toString() {
		return  "Item ('" + getId() + "'), " +
				"Name: '" + getName() + "' " +
				"Description: '" + this.getDescription()+ "'";
	}

	public int compareTo(Object o) {
		if (o instanceof Item) {
			return this.getDescription().compareTo( ((Item)o).getDescription() );
		}
		return 0;
	}



	// ********************** Business Methods ********************** //

}
