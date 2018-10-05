/*
 * 
 */
package com.api.procurementsystem.service.item;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.procurementsystem.entity.Catalogue;
import com.api.procurementsystem.repository.CatalogueRepository;


/**
 * The Class CatalogueServiceImpl.
 */
@Service
public class CatalogueServiceImpl implements CatalogueService {
	
	/** The catalogue repository. */
	@Autowired
	private CatalogueRepository catalogueRepository;

	
	@Override
	public void addItemToCatalogue(Catalogue catalogue) {
		catalogueRepository.save(catalogue);
		
	}
	
	
	@Override
    public List<Catalogue> getAllItems(){
        return (List<Catalogue>) catalogueRepository.findAll();
    }

	
	@Override
	public void evictCache() {
		// TODO Auto-generated method stub
		
	}

}
