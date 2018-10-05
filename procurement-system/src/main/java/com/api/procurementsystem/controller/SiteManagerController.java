package com.api.procurementsystem.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.api.procurementsystem.entity.PurchaseOrder;
import com.api.procurementsystem.service.siteManager.SiteManagerService;

/**
 * The Class SiteManagerController.
 */
@RestController
@RequestMapping("/managers")
public class SiteManagerController {
	
	
	@Autowired
	SiteManagerService siteManagerService;
	
	
	@ResponseBody
	 @RequestMapping(value = "/{id}/orders", method = RequestMethod.GET)
	 public Set<PurchaseOrder> getOrdersByManager(@PathVariable("id") Long managerId) {
	     return siteManagerService.getOrdersByManager(managerId);
	 }
	
	
	
	
	


}
