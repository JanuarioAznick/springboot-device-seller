package com.sha.springbootdeviceseller.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sha.springbootdeviceseller.Modal.Purchase;
import com.sha.springbootdeviceseller.Repository.Projection.PurchaseItem;

public interface PurchaseRepository extends JpaRepository<Purchase,Long>{

	@Query("select d.name as name, d.deviceType as type, p.price as price, p.color as color, p.purchaseTime as purchaseTime from Purchase p left join Device d on d.id = p.deviceId where p.userId = :userId")
	List<PurchaseItem> findAllPurchasesOfUser(@Param("userId") Long userId); 
}
