package org.anonymus.service;

/**
* Created by antoine on 3/1/2015.
*/
import java.util.List;

import org.anonymus.exception.ShopNotFound;
import org.anonymus.model.Shop;

public interface ShopService {

    public Shop create(Shop shop);
    public Shop delete(int id) throws ShopNotFound;
    public List<Shop> findAll();
    public Shop update(Shop shop) throws ShopNotFound;
    public Shop findById(int id);

}