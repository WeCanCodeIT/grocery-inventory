package org.wecancodeit.groceryinventory;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class GroceryInventoryRepository {
	
	private Map<Long, Product> products = new HashMap<>();

	public Map<Long, Product> getProducts() {
		return products;
	}

	public GroceryInventoryRepository() {
		Product productOne = new Product(1234L, "Nappies", "Diapers in NZ", new BigDecimal("40.00"));
		Product productTwo = new Product(2345L, "Handcrest", "Protection", new BigDecimal("3.00"));
		Product productThree = new Product(3456L, "Steakums", "Sort of meat", new BigDecimal("50.00"));
		
		this.addProduct(productOne);
		this.addProduct(productTwo);
		this.addProduct(productThree);
	}

	public Collection<Product> findAll() {
		return products.values();
	}

	public void addProduct(Product product) {
		products.put(product.getId(), product);
	}

	public Product findById(Long i) {
		return products.get(i);
	}

}
