package com.api.procurementsystem.service.item;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import com.api.procurementsystem.entity.Category;
import com.api.procurementsystem.entity.Supplier;
import com.api.procurementsystem.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	
    /** logger for this class. */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void createCategory(Category category) {
		categoryRepository.save(category);
		
	}

	@Override
	public List<Category> getAllCategories() {
		
		return (List<Category>) categoryRepository.findAll();
	}

	@Override
	@CacheEvict(
			value="routes",
			allEntries=true)
	public void evictCache() {
		logger.info("> evictCache");
		logger.info("< evictCache");
	}

}
