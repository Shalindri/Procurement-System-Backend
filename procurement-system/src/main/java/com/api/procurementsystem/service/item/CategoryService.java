package com.api.procurementsystem.service.item;
import java.util.List;
import org.springframework.stereotype.Service;
import com.api.procurementsystem.entity.Category;


/**
 * The Interface CategoryService.
 */
@Service
public interface CategoryService {

	public void createCategory(Category category);
	public List<Category> getAllCategories();
	public void evictCache();

}
