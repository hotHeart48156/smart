package org.order.dto;

import lombok.Data;
import org.order.domain.aggregation.Order;
import org.order.domain.entity.Address;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.address.City;
import org.order.domain.vaueobject.address.DetailAddress;
import org.order.domain.vaueobject.address.Province;
import org.order.domain.vaueobject.code.PostCode;
import org.order.domain.vaueobject.id.AddressId;
import org.order.domain.vaueobject.id.UserId;
import org.order.domain.vaueobject.name.ReceiverName;
import org.order.domain.vaueobject.name.UserName;
import org.order.domain.vaueobject.phone.PhoneNumber;
import org.order.domain.vaueobject.time.CreateTime;
import org.order.domain.vaueobject.type.OrderType;
import org.order.domain.vaueobject.type.SourceType;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author "yangbiao"
 */
@Data
public class OrderCreateDto extends AbstractDto{
    @NotNull
    private String userId;

    @NotNull
    private String username;

    @NotNull
    private String numberPhone;

    @NotNull
    private String receiverName;

    @NotNull
    private String orderType;

    @NotNull
    private String sourceType;

    @NotNull
    private String province;

    @NotNull
    private String city;

    @NotNull
    private String region;

    @NotNull
    private String postcode;

    @NotNull
    private String detail;

    @NotNull
    private List<String> productId;

    public void accept(Order order) {
        Address address = new Address();
        address.setAddressId(ValueObjectFactory.newInstance(AddressId.class));
        address.setCity(ValueObjectFactory. newInstance(City.class, city ));
        address.setCreateTime(ValueObjectFactory. newInstance(CreateTime.class));
        address.setPostCode(ValueObjectFactory. newInstance(PostCode.class, postcode ));
        address.setDetailAddress(ValueObjectFactory. newInstance(DetailAddress.class, detail ));
        address.setProvince(ValueObjectFactory. newInstance(Province.class, province ));
        order.setUserId(ValueObjectFactory. newInstance(UserId.class, userId ));
        order.setUserName(ValueObjectFactory. newInstance(UserName.class, username ));
        order.setReceiverPhone(ValueObjectFactory. newInstance(PhoneNumber.class, numberPhone ));
        order.setReceiverName(ValueObjectFactory. newInstance(ReceiverName.class, receiverName ));
        order.setOrderType(ValueObjectFactory. newInstance(OrderType.class, orderType ));
        order.setSourceType(ValueObjectFactory. newInstance(SourceType.class, sourceType ));
    }
}
