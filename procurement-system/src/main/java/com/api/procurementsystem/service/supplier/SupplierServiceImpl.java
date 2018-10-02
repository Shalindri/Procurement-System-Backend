package com.api.procurementsystem.service.supplier;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.procurementsystem.entity.Invoice;
import com.api.procurementsystem.entity.Item;
import com.api.procurementsystem.entity.PurchaseOrder;
import com.api.procurementsystem.entity.Supplier;
import com.api.procurementsystem.repository.InvoiceRepository;
import com.api.procurementsystem.repository.PurchaseOrderRepository;
import com.api.procurementsystem.repository.SupplierRepository;

@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	SupplierRepository supplierRepository;
	@Autowired
	PurchaseOrderRepository purchaseOrderRepository;
	@Autowired
	InvoiceRepository invoiceRepository;

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
	
		for (Item i : itemList) {
			i.setQuantity(i.getQuantity() - i.getIssued_quantity());
			i.setIssued_quantity(i.getIssued_quantity());

		}
		purchaseOrder.setItems(itemList);
		purchaseOrder.setOrder_status("Dispatched");
		
		purchaseOrderRepository.save(purchaseOrder);
		
		
		if(!purchaseOrder.isOn_hold()) {
			
			LocalDate localDate = LocalDate.now();
			Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
			
			Invoice invoice= new Invoice();
			invoice.setIssue_date(date);
			invoice.setSequential_ref(purchaseOrder.getSequential_ref());
			invoice.setTotal_amount(purchaseOrder.getTotal());
			
			invoiceRepository.save(invoice);
		}
		
		//notify site Manager via SMS
		
		return ResponseEntity.noContent().build();

	}

	@Override
	public List<Supplier> getAllSuppliers() {
		
		return (List<Supplier>) supplierRepository.findAll();
	}

}
