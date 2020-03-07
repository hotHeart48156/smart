package org.users.dto;

import org.users.domain.aggregation.User;
import org.users.domain.entity.Address;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.address.City;
import org.users.domain.valueobject.address.DetailAddress;
import org.users.domain.valueobject.address.Province;
import org.users.domain.valueobject.address.Region;
import org.users.domain.valueobject.id.Id;
import org.users.domain.valueobject.id.UserId;

/**
 * @author "yangbiao"
 */
public class AddressDto extends AbstractDto {
    private String id;
    private String province;
    private String city;
    private String region;
    private String detail;


    public void accept(User user, Address address) {
        if (id.equals(user.getUserId().getId())) {
            Id id = ValueObjectFactory.newInstance(Id.class);
            address.setProvince(ValueObjectFactory.newInstance(Province.class, province.getClass()));
            address.setUserId(ValueObjectFactory.newInstance(UserId.class, this.id.getClass()));
            address.setCity(ValueObjectFactory.newInstance(City.class, city.getClass()));
            address.setRegion(ValueObjectFactory.newInstance(Region.class, region.getClass()));
            address.setDetailAddress(ValueObjectFactory.newInstance(DetailAddress.class, detail.getClass()));
            address.setId(id);
            user.getAddressIds().add(id);
        }
    }

    @Override
    @Deprecated
    public void accept(User user) {

    }
}
