package org.wecancodeit.groceryinventory;

import java.math.BigDecimal;

public class Product {

	private Long id;
	private String name;
	private String description;
	private BigDecimal price;
	private String img;

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

	public Product(Long id, String name, String description, String img, BigDecimal price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.img = img;
		this.price = price;
	}

}
