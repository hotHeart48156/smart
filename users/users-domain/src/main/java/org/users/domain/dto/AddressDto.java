package org.users.domain.dto.entity;

import lombok.Data;
import org.users.domain.entity.Address;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.address.City;
import org.users.domain.valueobject.address.DetailAddress;
import org.users.domain.valueobject.address.Province;
import org.users.domain.valueobject.address.Region;
import org.users.domain.valueobject.id.AddressId;
import org.users.domain.valueobject.id.Id;
import org.users.domain.valueobject.id.UserId;

@Data
public class AddressDto {
    private String id;
    private String addressId;
    private String userId;
    private String province;
    private String city;
    private String region;
    private String detailAddress;

    public void accept(Address address) {
        address.setId(ValueObjectFactory.newInstance(Id.class, id));
        address.setAddressId(ValueObjectFactory.newInstance(AddressId.class, addressId));
        address.setUserId(ValueObjectFactory.newInstance(UserId.class, userId));
        address.setProvince(ValueObjectFactory.newInstance(Province.class, province));
        address.setCity(ValueObjectFactory.newInstance(City.class, city));
        address.setRegion(ValueObjectFactory.newInstance(Region.class, region));
        address.setDetailAddress(ValueObjectFactory.newInstance(DetailAddress.class, detailAddress));
    }
}
