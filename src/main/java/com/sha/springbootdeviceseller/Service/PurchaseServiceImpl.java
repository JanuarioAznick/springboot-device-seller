package com.sha.springbootdeviceseller.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sha.springbootdeviceseller.Modal.Purchase;
import com.sha.springbootdeviceseller.Repository.PurchaseRepository;
import com.sha.springbootdeviceseller.Repository.Projection.PurchaseItem;

@Service
public class PurchaseServiceImpl implements PurchaseService{

	private final PurchaseRepository purchaseRepository;

	public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
		
		this.purchaseRepository = purchaseRepository;
	}
	
	@Override
	public Purchase savePurchase(Purchase purchase) {
		
		purchase.setPurchaseTime(LocalDateTime.now());
		
		return purchaseRepository.save(purchase);
	}
	
	@Override
	public List<PurchaseItem> findPurchaseItemsOfUser(Long userId){
		
		return purchaseRepository.findAllPurchasesOfUser(userId);
	}
	
}
