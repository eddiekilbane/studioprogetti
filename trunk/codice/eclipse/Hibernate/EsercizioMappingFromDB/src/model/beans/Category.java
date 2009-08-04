package model.beans;

import java.io.Serializable;
import java.util.*;


public class Category implements Serializable {

	private Long id = null;
	private int version;
	private String name;
	private Category parentCategory;
	private Set childCategories = new HashSet();
	private Set categorizedItems = new HashSet();


	/**
	 * No-arg constructor for JavaBean tools.
	 */
	Category() {}

	/**
	 * Full constructor.
	 */
	public Category(String name, Category parentCategory, Set childCategories, Set categorizedItems) {
		this.name = name;
		this.parentCategory = parentCategory;
		this.childCategories = childCategories;
		this.categorizedItems = categorizedItems;
	}

	/**
	 * Simple constructor.
	 */
	public Category(String name) {
		this.name = name;
	}

	// ********************** Accessor Methods ********************** //

	public Long getId() { return id; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public Category getParentCategory() { return parentCategory; }
	public void setParentCategory(Category parentCategory) { this.parentCategory = parentCategory; }

	public Set getChildCategories() { return childCategories; }
	public void addChildCategory(Category category) {
		if (category == null)
			throw new IllegalArgumentException("Can't add a null Category as child.");
		// Remove from old parent category
		if (category.getParentCategory() != null)
			category.getParentCategory().getChildCategories()
										 .remove(category);
		// Set parent in child
		category.setParentCategory(this);
		// Set child in parent
		this.getChildCategories().add(category);
	}

	public Set getCategorizedItems() { return categorizedItems; }
	
	public void addCategorizedItem(CategorizedItem catItem) {
		if (catItem == null)
			throw new IllegalArgumentException("Can't add a null CategorizedItem.");
		this.getCategorizedItems().add(catItem);
	}

	

	// ********************** Common Methods ********************** //

	

	

	public String toString() {
		return  "Category ('" + getId() + "'), " +
				"Name: '" + getName() + "'";
	}

	

	// ********************** Business Methods ********************** //

}
