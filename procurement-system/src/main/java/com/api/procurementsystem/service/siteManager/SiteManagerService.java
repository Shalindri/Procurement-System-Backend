package com.api.procurementsystem.service.siteManager;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.api.procurementsystem.entity.PurchaseOrder;

@Service
public interface SiteManagerService {

	Set<PurchaseOrder> getOrdersByManager(Long managerId);

}
