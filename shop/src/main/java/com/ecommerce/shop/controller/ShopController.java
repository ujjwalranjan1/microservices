package com.ecommerce.shop.controller;

import com.ecommerce.shop.entity.Shop;
import com.ecommerce.shop.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
    @Autowired
    ShopRepository shopRepository;
    @GetMapping("/")
    public String getHomeMessage(){
        return "<h1>Working fine</h1>";
    }

    @PostMapping("/registerShop")
    public ResponseEntity<String> registerShop(@RequestBody Shop shop){
        Shop savedShop=null;
        ResponseEntity response=null;
        try {
            savedShop = shopRepository.save(shop);
            if (savedShop.getShopId() > 0) {
                response = new ResponseEntity<>(
                        "Shop is registered",
                        HttpStatus.CREATED
                );
            }
        }catch(Exception ex){
            response=new ResponseEntity<>(
                    "Exception occured due to" +ex.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
        return response;
    }
}
