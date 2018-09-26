package com.api.procurementsystem.service.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.procurementsystem.entity.Category;
import com.api.procurementsystem.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void createCategory(Category category) {
		categoryRepository.save(category);
		
	}

}
