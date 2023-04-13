package com.ecommerce.shop.repository;

import com.ecommerce.shop.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop,Long> {
    public Shop findByShopNumber(String shopNumber);
}
