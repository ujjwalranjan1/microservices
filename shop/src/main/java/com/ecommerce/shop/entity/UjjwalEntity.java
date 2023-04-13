package com.ecommerce.shop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UjjwalEntity {
    @Id
    private int a;
    @Id
    private int b;
    private int c;

}
