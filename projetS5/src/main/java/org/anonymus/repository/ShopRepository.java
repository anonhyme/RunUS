package org.anonymus.repository;

/**
* Created by antoine on 3/1/2015.
*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.anonymus.model.Shop;

public interface ShopRepository extends JpaRepository<Shop, Integer> {

}