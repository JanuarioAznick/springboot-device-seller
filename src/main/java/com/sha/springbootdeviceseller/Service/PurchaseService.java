package com.sha.springbootdeviceseller.Service;

import java.util.List;

import com.sha.springbootdeviceseller.Modal.Purchase;
import com.sha.springbootdeviceseller.Repository.Projection.PurchaseItem;

public interface PurchaseService {

	Purchase savePurchase(Purchase purchase);

	List<PurchaseItem> findPurchaseItemsOfUser(Long userId);

}
