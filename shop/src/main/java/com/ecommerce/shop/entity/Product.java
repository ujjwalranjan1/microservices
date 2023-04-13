package com.ecommerce.shop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @SequenceGenerator(
            name="product_seq",
            sequenceName = "product_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_seq"
    )
    private  Long productId;
    private String category;
    private String name;
    private String size;
//    private String imageUrl;
    private int price;
    private String location;
//    @ManyToMany
//    @JoinTable(
//        joinColumns = @JoinColumn(name="product_id"),
//        inverseJoinColumns = @JoinColumn(name = "shop_id")
//    )
//    private List<Shop> shopList;
    @OneToMany(mappedBy = "product")
    private List<ProductShopQuantity> shopAssoc;


}
