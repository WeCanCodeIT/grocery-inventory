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
		Product productOne = new Product(1234L, "Nappies", "Diapers in NZ", "https://media.takealot.com/covers_tsins/32073939/32073939_2-zoom.jpg?1518703118", new BigDecimal("40.00"));
		Product productTwo = new Product(2345L, "Handcrest", "Protection", "https://mark.trademarkia.com/logo-images/lighthouse-for-the-blind/handcrest-73344647.jpg", new BigDecimal("3.00"));
		Product productThree = new Product(3456L, "Steakums", "Meat, sort of", "https://i5.walmartimages.com/asr/5f440196-13d6-44bf-ac13-1782372d0353_1.de20d27b71694cf28f53c0f7c5b34ab5.jpeg?odnHeight=450&odnWidth=450&odnBg=FFFFFF", new BigDecimal("50.00"));
		
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
