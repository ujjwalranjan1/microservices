package com.ecommerce.shop.entity;

import com.ecommerce.shop.VO.Address;
import com.ecommerce.shop.repository.OwnerRepository;
import com.ecommerce.shop.repository.ShopRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShopTest {

    @Autowired
    ShopRepository shopRepository;
    @Autowired
    OwnerRepository ownerRepository;
    @Test
    void testShop(){
        Owner owner= Owner.builder()
                .firstname("ujjwal")
                .lastName("ranjan")
                .build();

        Address address= Address.builder()
                .houseNumber("2")
                .Country("INdia")
                .build();

        Shop shop= Shop.builder()
                .shopNumber("123")
                .address(address)
//                .owner(owner)
                .build();
        shopRepository.save(shop);
    }
    @Test
    void testOwner(){
        Owner owner= Owner.builder()
                .firstname("ujjwal")
                .lastName("ranjan")
                .emailId("ujjwalranjan6@gmail.com")
                .build();
        ownerRepository.save(owner);

    }
}