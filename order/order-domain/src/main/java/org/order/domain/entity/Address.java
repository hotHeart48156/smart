package org.order.domain.entity;

import lombok.Data;
import org.order.domain.vaueobject.address.City;
import org.order.domain.vaueobject.address.DetailAddress;
import org.order.domain.vaueobject.address.Province;
import org.order.domain.vaueobject.address.Region;
import org.order.domain.vaueobject.code.PostCode;
import org.order.domain.vaueobject.id.AddressId;
import org.order.domain.vaueobject.time.CreateTime;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
@Data
public class Address implements Entity{
    @EmbeddedId
private AddressId addressId;
    @Embedded
private City city;
    @Embedded
private DetailAddress detailAddress;
    @Embedded
private Province province;
    @Embedded
private Region region;
    @Embedded
private PostCode postCode;
    @Embedded
private CreateTime createTime;

   
}
