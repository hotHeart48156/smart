package org.order.dto;

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

public class OrderCreateDto {
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
        address.setAddressId(ValueObjectFactory.getInstance(AddressId.class));
        address.setCity(ValueObjectFactory.getInstance(City.class, city.getClass()));
        address.setCreateTime(ValueObjectFactory.getInstance(CreateTime.class));
        address.setPostCode(ValueObjectFactory.getInstance(PostCode.class, postcode.getClass()));
        address.setDetailAddress(ValueObjectFactory.getInstance(DetailAddress.class, detail.getClass()));
        address.setProvince(ValueObjectFactory.getInstance(Province.class, province.getClass()));
        order.setAddress(address);
        order.setUserId(ValueObjectFactory.getInstance(UserId.class, userId.getClass()));
        order.setUserName(ValueObjectFactory.getInstance(UserName.class, username.getClass()));
        order.setReceiverPhone(ValueObjectFactory.getInstance(PhoneNumber.class, numberPhone.getClass()));
        order.setReceiverName(ValueObjectFactory.getInstance(ReceiverName.class, receiverName.getClass()));
        order.setOrderType(ValueObjectFactory.getInstance(OrderType.class, orderType.getClass()));
        order.setSourceType(ValueObjectFactory.getInstance(SourceType.class, sourceType.getClass()));
    }
}
