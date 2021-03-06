package jpabook.jpashop.domain.item;

import lombok.Getter;

import javax.persistence.Embeddable;

/**
 * @author TaeWK
 */
@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
