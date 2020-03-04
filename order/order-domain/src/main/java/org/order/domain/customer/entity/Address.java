package org.order.domain.customer.entity;

import com.geekhalo.ddd.lite.domain.support.jpa.JpaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.vaueobject.address.City;
import org.order.domain.customer.vaueobject.address.DetailAddress;
import org.order.domain.customer.vaueobject.address.Province;
import org.order.domain.customer.vaueobject.address.Region;
import org.order.domain.customer.vaueobject.code.PostCode;
import org.order.domain.customer.vaueobject.id.AddressId;
import org.order.domain.customer.vaueobject.time.CreateTime;

import java.util.Date;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Address extends JpaEntity {
    private AddressId addressId;
    private City city;
    private DetailAddress detailAddress;
    private Province province;
    private Region region;
    private PostCode postCode;
    private CreateTime createTime;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }
}
