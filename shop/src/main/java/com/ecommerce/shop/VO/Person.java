package com.ecommerce.shop.VO;

import jakarta.persistence.*;
import lombok.*;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Person {
    @Id
    @SequenceGenerator(
            name="person_seq",
            sequenceName = "person_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "person_seq"
    )
    protected Long personId;
    protected String firstname;
    protected String lastName;
    @Column(name = "email_id")
    protected String emailId;
    protected String mobileNumber;

//    private String imageUrl;
}
