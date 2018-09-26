package com.api.procurementsystem.service.item;

import org.springframework.stereotype.Service;

import com.api.procurementsystem.entity.Category;

@Service
public interface CategoryService {
	public void createCategory(Category category);

}
