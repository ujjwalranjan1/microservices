package com.ecommerce.shop.VO;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductShopQuantityId implements Serializable {
    private Long shop;
    private Long product;

}
