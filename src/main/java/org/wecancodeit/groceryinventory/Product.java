package org.wecancodeit.groceryinventory;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Product {

	private Long id;
	private String name;
	private String description;
	private BigDecimal price;
	private String img;
	private ArrayList<Tag> tags;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String getImg() {
		return img;
	}

	public ArrayList<Tag> getTags() {
		return tags;
	}

	public Product(Long id, String name, String description, String img, BigDecimal price, ArrayList<Tag> tags) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.img = img;
		this.price = price;
		this.tags = tags;
	}

}
