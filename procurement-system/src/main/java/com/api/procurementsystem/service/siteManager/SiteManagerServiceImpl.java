package com.api.procurementsystem.service.siteManager;


import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.procurementsystem.entity.PurchaseOrder;
import com.api.procurementsystem.entity.SiteManager;
import com.api.procurementsystem.repository.SiteManagerRepository;

@Service
public class SiteManagerServiceImpl implements SiteManagerService {
	@Autowired
	SiteManagerRepository siteManagerRepository;
	
	
	@Override
	public Set<PurchaseOrder> getOrdersByManager(Long managerId) {
		SiteManager  managerObj = siteManagerRepository.findById(managerId).get();
		Set<PurchaseOrder> orderList =  managerObj.getPurchaseOrders();

		return orderList;
		}

}
