package com.api.procurementsystem.service.supplier;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.procurementsystem.entity.Item;
import com.api.procurementsystem.entity.PurchaseOrder;
import com.api.procurementsystem.entity.Supplier;
import com.api.procurementsystem.repository.PurchaseOrderRepository;
import com.api.procurementsystem.repository.SupplierRepository;

@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	SupplierRepository supplierRepository;
	PurchaseOrderRepository purchaseOrderRepository;

	@Override
	public Set<PurchaseOrder> getOrdersBySupplier(Long supplierId) {
		Supplier supObj = supplierRepository.findById(supplierId).get();
		Set<PurchaseOrder> orderList = supObj.getSupplierOrders();

		Set<PurchaseOrder> approved = new HashSet<PurchaseOrder>();
		for (PurchaseOrder po : orderList) {

			String status = po.getOrder_status();

			if (status.equals("Approved")) {
				approved.add(po);
			}
		}

		return approved;
	}

	@Override
	public void addSupplier(Supplier supplier) {
		supplierRepository.save(supplier);

	}

	@Override
	public ResponseEntity<Object> dispatchOrder(PurchaseOrder purchaseOrder) {

		Set<Item> itemList = purchaseOrder.getItems();
		
		System.out.println();
		

		for (Item i : itemList) {
			i.setQuantity(i.getQuantity() - i.getIssued_quantity());
			i.setIssued_quantity(i.getIssued_quantity());

		}
		purchaseOrder.setItems(itemList);
		
		System.out.println("console log##########");
		purchaseOrderRepository.save(purchaseOrder);
		return ResponseEntity.noContent().build();

	}

}
