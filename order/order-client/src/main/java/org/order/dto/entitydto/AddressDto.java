package org.order.dto.entitydto;

import lombok.Data;
import org.order.domain.entity.Address;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.address.City;
import org.order.domain.vaueobject.address.DetailAddress;
import org.order.domain.vaueobject.address.Province;
import org.order.domain.vaueobject.address.Region;
import org.order.domain.vaueobject.code.PostCode;
import org.order.domain.vaueobject.id.AddressId;
import org.order.domain.vaueobject.time.CreateTime;

@Data
public class AddressDto {
    private String addressId;
    private String city;
    private String detailAddress;
    private String province;
    private String region;
    private String postCode;
    private String createTime;

    public void accept(Address address) {
        address.setAddressId(ValueObjectFactory.newInstance(AddressId.class, addressId));
        address.setCity(ValueObjectFactory.newInstance(City.class, city));
        address.setDetailAddress(ValueObjectFactory.newInstance(DetailAddress.class, detailAddress));
        address.setProvince(ValueObjectFactory.newInstance(Province.class, province));
        address.setRegion(ValueObjectFactory.newInstance(Region.class, region));
        address.setPostCode(ValueObjectFactory.newInstance(PostCode.class, postCode));
        address.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
    }
}
