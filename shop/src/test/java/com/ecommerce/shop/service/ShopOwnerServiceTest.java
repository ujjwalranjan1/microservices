package com.ecommerce.shop.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShopOwnerServiceTest {
    @Autowired
    ShopOwnerService shopOwnerService;
    @Test
    void updateowner(){
        String shopNumber="123";
        String emailId="ujjwalranjan1@gmail.com";
        shopOwnerService.mapShopPerson(shopNumber,emailId);
    }

}