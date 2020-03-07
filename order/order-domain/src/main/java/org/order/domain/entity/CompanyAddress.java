package org.order.domain.entity;

import lombok.Data;
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

import javax.persistence.Embedded;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */

@Data
@Entity
public class CompanyAddress implements org.order.domain.entity.Entity {
    @Embedded
private AddressId addressId;
    @Embedded
private AddressName addressName;
    @Embedded
private SendAddressStatus sendAddressStatus;
    @Embedded
private ReceiveStatus receiveStatus;
    @Embedded
private ReceiverName receiverName;
    @Embedded
private PhoneNumber receivePhone;
    @Embedded
private Province province;
    @Embedded
private City city;
    @Embedded
private Region region;
    @Embedded
private DetailAddress detailAddress;
    @Embedded
private CreateTime createTime;



}
