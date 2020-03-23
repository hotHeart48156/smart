package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.address.City;
import org.product.domain.valueobject.address.DetailAddress;
import org.product.domain.valueobject.address.Province;
import org.product.domain.valueobject.address.Region;
import org.product.domain.valueobject.id.Id;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
@Data
@javax.persistence.Entity
public class Address implements Entity {
    @EmbeddedId
private Id id;
    @Embedded
private Province province;
    @Embedded
private City city;
    @Embedded
private Region region;
    @Embedded
private DetailAddress detailAddress;
}
