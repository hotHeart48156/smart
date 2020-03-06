package org.order.domain.customer.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.vaueobject.address.City;
import org.order.domain.customer.vaueobject.address.DetailAddress;
import org.order.domain.customer.vaueobject.address.Province;
import org.order.domain.customer.vaueobject.address.Region;
import org.order.domain.customer.vaueobject.id.AddressId;
import org.order.domain.customer.vaueobject.name.AddressName;
import org.order.domain.customer.vaueobject.name.ReceiverName;
import org.order.domain.customer.vaueobject.phone.PhoneNumber;
import org.order.domain.customer.vaueobject.status.ReceiveStatus;
import org.order.domain.customer.vaueobject.status.SendAddressStatus;
import org.order.domain.customer.vaueobject.time.CreateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class CompanyAddress implements org.order.domain.customer.entity.Entity {
    @Embedded
private  AddressId addressId;
    @Embedded
private  AddressName addressName;
    @Embedded
private  SendAddressStatus sendAddressStatus;
    @Embedded
private  ReceiveStatus receiveStatus;
    @Embedded
private  ReceiverName receiverName;
    @Embedded
private  PhoneNumber receivePhone;
    @Embedded
private  Province province;
    @Embedded
private  City city;
    @Embedded
private  Region region;
    @Embedded
private  DetailAddress detailAddress;
    @Embedded
private  CreateTime createTime;



}
