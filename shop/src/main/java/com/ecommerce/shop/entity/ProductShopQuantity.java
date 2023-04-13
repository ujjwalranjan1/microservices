package com.ecommerce.shop.entity;

import com.ecommerce.shop.VO.ProductShopQuantityId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(ProductShopQuantityId.class)
public class ProductShopQuantity {
    @Id
    @ManyToOne
    @JoinColumn(
            name = "product_id",
            referencedColumnName = "productId"
    )
    private Product product;
    @Id
    @ManyToOne
    @JoinColumn(
            name="shop_id",
            referencedColumnName = "shopId"
    )
    private Shop shop;
    private int quantity;
}
