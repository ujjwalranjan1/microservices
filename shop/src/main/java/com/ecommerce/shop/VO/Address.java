package com.ecommerce.shop.VO;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Builder
public class Address {
    private String houseNumber;
    private String street;
    private String city;
    private String state;
    private String Country;
    private String zipCode;
}
