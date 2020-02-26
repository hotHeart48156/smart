package org.users.domain.customer.entity;

import lombok.Data;
import org.users.domain.customer.valueobject.address.City;
import org.users.domain.customer.valueobject.address.DetailAddress;
import org.users.domain.customer.valueobject.address.Province;
import org.users.domain.customer.valueobject.address.Region;
import org.users.domain.customer.valueobject.id.AddressId;
import org.users.domain.customer.valueobject.id.UserId;

/**
 * @author "yangbiao"
 */
@Data
public class Address implements Entity {
    private AddressId addressId;
    private UserId userId;
    private Province province;
    private City city;
    private Region region;
    private DetailAddress detailAddress;
}
