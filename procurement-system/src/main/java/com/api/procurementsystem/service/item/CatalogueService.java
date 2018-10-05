/*
 * 
 */
package com.api.procurementsystem.service.item;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.procurementsystem.entity.Catalogue;

@Service
public interface CatalogueService {
	public void addItemToCatalogue(Catalogue catalogue);

	List<Catalogue> getAllItems();

	public void evictCache();

}
