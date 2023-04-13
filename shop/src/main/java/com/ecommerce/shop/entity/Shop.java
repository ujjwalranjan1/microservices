package com.ecommerce.shop.entity;

import com.ecommerce.shop.VO.Address;
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
public class Shop {
    @Id
    @SequenceGenerator(
            allocationSize = 1,
            name = "shop_seq",
            sequenceName = "shop_seq"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "shop_seq"
    )
    private Long shopId;

    private String shopNumber;
    @Embedded
    private Address address;
    @OneToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name="owner_id",
            referencedColumnName = "personId"
    )
    private Owner owner;
//    @ManyToMany(mappedBy = "shopList")
//    private List<Product> productList;
    @OneToMany(mappedBy = "shop")
    List<ProductShopQuantity> productAssoc;
}
