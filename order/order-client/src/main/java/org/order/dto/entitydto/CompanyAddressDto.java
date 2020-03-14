package org.order.dto.entitydto;

import lombok.Data;
import org.order.domain.entity.CompanyAddress;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.address.City;
import org.order.domain.vaueobject.address.DetailAddress;
import org.order.domain.vaueobject.address.Province;
import org.order.domain.vaueobject.address.Region;
import org.order.domain.vaueobject.id.AddressId;
import org.order.domain.vaueobject.name.AddressName;
import org.order.domain.vaueobject.name.ReceiverName;
import org.order.domain.vaueobject.phone.PhoneNumber;
import org.order.domain.vaueobject.status.ReceiveStatus;
import org.order.domain.vaueobject.status.SendAddressStatus;
import org.order.domain.vaueobject.time.CreateTime;

@Data
public class CompanyAddressDto {
    private String addressId;
    private String addressName;
    private String sendAddressStatus;
    private String receiveStatus;
    private String receiverName;
    private String receivePhone;
    private String province;
    private String city;
    private String region;
    private String detailAddress;
    private String createTime;

    public void accept(CompanyAddress companyaddress) {
        companyaddress.setAddressId(ValueObjectFactory.newInstance(AddressId.class, addressId));
        companyaddress.setAddressName(ValueObjectFactory.newInstance(AddressName.class, addressName));
        companyaddress.setSendAddressStatus(ValueObjectFactory.newInstance(SendAddressStatus.class, sendAddressStatus));
        companyaddress.setReceiveStatus(ValueObjectFactory.newInstance(ReceiveStatus.class, receiveStatus));
        companyaddress.setReceiverName(ValueObjectFactory.newInstance(ReceiverName.class, receiverName));
        companyaddress.setReceivePhone(ValueObjectFactory.newInstance(PhoneNumber.class, receivePhone));
        companyaddress.setProvince(ValueObjectFactory.newInstance(Province.class, province));
        companyaddress.setCity(ValueObjectFactory.newInstance(City.class, city));
        companyaddress.setRegion(ValueObjectFactory.newInstance(Region.class, region));
        companyaddress.setDetailAddress(ValueObjectFactory.newInstance(DetailAddress.class, detailAddress));
        companyaddress.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
    }
}
