package org.wecancodeit.groceryinventory;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Collection;

import org.junit.Test;

public class GroceryInventoryRepositoryTest {
	
	GroceryInventoryRepository testRepo = new GroceryInventoryRepository();
	
	@Test
	public void addProductsShouldAddProductsToMap() {
		Product test = new Product(1L, "", "", new BigDecimal("10.00"));
		
		int sizeBeforeNewProduct = testRepo.getProducts().size();
		testRepo.addProduct(test);
		int sizeAfterNewProduct = testRepo.getProducts().size();
		
		assertThat(sizeAfterNewProduct, is(equalTo(sizeBeforeNewProduct + 1)));
	}
	
	@Test
	public void findAllShouldReturnAllValues() {
		Collection<Product> underTest = testRepo.findAll();
		assertThat(underTest.size(), is(equalTo(3)));
	}
	
	@Test
	public void findAllShouldReturnProducts() {
		Collection<Product> underTest = testRepo.findAll();
		
		for (Product product : underTest) {
			assertTrue(product instanceof Product);
		}
	}
	
	@Test
	public void findOneShouldReturnProductById() {
		Product underTest = testRepo.findById(1234L);
		
		assertThat(underTest.getName(), is(equalTo("Nappies")));
	}

}
