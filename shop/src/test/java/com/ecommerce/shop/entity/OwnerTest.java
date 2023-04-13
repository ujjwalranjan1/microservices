package com.ecommerce.shop.entity;

import com.ecommerce.shop.repository.OwnerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OwnerTest {
    @Autowired
    OwnerRepository ownerRepository;
    @Test
    void testownerrepository(){
        Owner owner= Owner.builder()
                .firstname("ujjwal")
                .lastName("ranjan")
                .build();
        ownerRepository.save(owner);
    }

}