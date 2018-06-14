package org.wecancodeit.groceryinventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GroceryInventoryController {
	
	@Autowired
	GroceryInventoryRepository groceryInventoryRepo;

	@RequestMapping("/products")
	public String getProducts(Model model) {
		model.addAttribute("products", groceryInventoryRepo.findAll());
		return "products";
	}
	
	@RequestMapping("/products/{id}")
	public String getProduct(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("product", groceryInventoryRepo.findById(id));
		return "product";
	}
}
