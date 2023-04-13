package com.ecommerce.shop.repository;

import com.ecommerce.shop.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long> {
    Owner findByEmailId(String emailId);
}
