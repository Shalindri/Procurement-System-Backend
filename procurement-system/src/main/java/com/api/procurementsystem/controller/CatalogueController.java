package com.api.procurementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.procurementsystem.entity.Catalogue;
import com.api.procurementsystem.service.item.CatalogueService;


@RestController
@RequestMapping("/catalogue")
public class CatalogueController { 
	@Autowired
	private CatalogueService catalogueService;
	
	
	@RequestMapping(value = "/addItem", method = RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED,reason="Success message shalindri created**********")  
	public void addItemToCatalogue(@RequestBody Catalogue catalogue) {
		catalogueService.addItemToCatalogue(catalogue);;
	}
	
	@ResponseBody
	 @RequestMapping(value = "/list", method = RequestMethod.GET)
	 public List<Catalogue> getAllItems() {
	     return catalogueService.getAllItems();
	 }

}
