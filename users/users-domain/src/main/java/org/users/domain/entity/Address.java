package org.users.domain.entity;

import lombok.Data;
import org.users.domain.valueobject.address.City;
import org.users.domain.valueobject.address.DetailAddress;
import org.users.domain.valueobject.address.Province;
import org.users.domain.valueobject.address.Region;
import org.users.domain.valueobject.id.AddressId;
import org.users.domain.valueobject.id.Id;
import org.users.domain.valueobject.id.UserId;

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
private AddressId addressId;
    @Embedded
private UserId userId;
    @Embedded
private Province province;
    @Embedded
private City city;
    @Embedded
private Region region;
    @Embedded
private DetailAddress detailAddress;
}
