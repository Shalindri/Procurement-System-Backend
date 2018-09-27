package com.api.procurementsystem.service.item;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.procurementsystem.entity.Catalogue;
import com.api.procurementsystem.repository.CatalogueRepository;


@Service
public class CatalogueServiceImpl implements CatalogueService {
	
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

}
