package com.ecommerce.shop.entity;

import com.ecommerce.shop.VO.Person;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Data

@Table(
        uniqueConstraints = {
                @UniqueConstraint(
                        name="Unique_email_owner",
                        columnNames = {"email_id"}
                )
        }
)
public class Owner extends Person {
    public Owner() {
    }

    @OneToOne(
            cascade = CascadeType.ALL,
            mappedBy = "owner"
    )
    private Shop shop;

    @Builder
    public Owner(Long personId, String firstname, String lastName, String emailId, String mobileNumber, Shop shop) {
        super(personId, firstname, lastName, emailId, mobileNumber);
        this.shop = shop;
    }


}
