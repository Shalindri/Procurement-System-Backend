package com.api.procurementsystem.service.siteManager;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.api.procurementsystem.entity.PurchaseOrder;

// TODO: Auto-generated Javadoc
/**
 * The Interface SiteManagerService.
 */
@Service
public interface SiteManagerService {

	/**
	 * Gets the orders by manager.
	 *
	 * @param managerId the manager id
	 * @return the orders by manager
	 */
	Set<PurchaseOrder> getOrdersByManager(Long managerId);

}
