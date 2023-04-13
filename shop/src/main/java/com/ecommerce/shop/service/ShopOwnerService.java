package com.ecommerce.shop.service;

import com.ecommerce.shop.entity.Owner;
import com.ecommerce.shop.entity.Shop;
import com.ecommerce.shop.repository.OwnerRepository;
import com.ecommerce.shop.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ShopOwnerService {
    @Autowired
    ShopRepository shopRepository;
    @Autowired
    OwnerRepository ownerRepository;
    public void mapShopPerson(String shopNumber,String emailId){
        Shop shop=shopRepository.findByShopNumber(shopNumber);
        Owner owner=ownerRepository.findByEmailId(emailId);
        shop.setOwner(owner);
        shopRepository.save(shop);
    }
}
