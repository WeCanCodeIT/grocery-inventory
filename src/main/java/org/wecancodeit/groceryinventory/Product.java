package org.wecancodeit.groceryinventory;

import java.math.BigDecimal;

public class Product {

	private Long id;
	private String name;
	private String description;
	private BigDecimal price;

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

	public Product(Long id, String name, String description, BigDecimal price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}

}
