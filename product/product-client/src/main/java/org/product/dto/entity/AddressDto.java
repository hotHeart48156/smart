package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.Address;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.address.City;
import org.product.domain.valueobject.address.DetailAddress;
import org.product.domain.valueobject.address.Province;
import org.product.domain.valueobject.address.Region;
import org.product.domain.valueobject.id.Id;
@Data
public class AddressDto   extends AbstractEntityDto{
    private String id;
    private String province;
    private String city;
    private String region;
    private String detailAddress;

    public void accept(Address address) {
        address.setId(ValueObjectFactory.newInstance(Id.class, id));
        address.setProvince(ValueObjectFactory.newInstance(Province.class, province));
        address.setCity(ValueObjectFactory.newInstance(City.class, city));
        address.setRegion(ValueObjectFactory.newInstance(Region.class, region));
        address.setDetailAddress(ValueObjectFactory.newInstance(DetailAddress.class, detailAddress));
    }
}
