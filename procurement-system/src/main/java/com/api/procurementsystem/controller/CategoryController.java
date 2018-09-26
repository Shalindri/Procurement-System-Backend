package com.api.procurementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.procurementsystem.entity.Category;
import com.api.procurementsystem.service.item.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/addCategory", method = RequestMethod.POST)
	public void createCategory(@RequestBody Category category) {
		categoryService.createCategory(category);
	}

}
