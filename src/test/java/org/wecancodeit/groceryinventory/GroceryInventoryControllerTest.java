package org.wecancodeit.groceryinventory;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(GroceryInventoryController.class)
public class GroceryInventoryControllerTest {
	
	@Resource
	MockMvc mvc;
	
	@MockBean
	GroceryInventoryRepository repo;
	
	@Mock
	Product product;
	
	@Test
	public void getProductsShouldReturnProductsView() throws Exception {
		mvc.perform(get("/products")).andExpect(view().name(is(equalTo("products"))));
	}
	
	@Test
	public void getProductsShouldBeOk() throws Exception {
		mvc.perform(get("/products")).andExpect(status().is2xxSuccessful());
	}
	
	@Test
	public void getProductsShouldReturnAllProducts() throws Exception {
		mvc.perform(get("/products")).andExpect(model().attribute("products", is(repo.findAll())));
	}
	
	@Test
	public void getProductShouldReturnProductView() throws Exception {
		given(repo.findById(42L)).willReturn(product);
		mvc.perform(get("/products/42")).andExpect(view().name(is(equalTo("product"))));
	}
	
	@Test
	public void getProductShouldBeOk() throws Exception {
		given(repo.findById(42L)).willReturn(product);
		mvc.perform(get("/products/42")).andExpect(status().is2xxSuccessful());
	}
	
	@Test
	public void getProductShouldReturnOneProduct() throws Exception {
		given(repo.findById(42L)).willReturn(product);
		mvc.perform(get("/products/42")).andExpect(model().attribute("product", is(repo.findById(42L))));
	}
}
