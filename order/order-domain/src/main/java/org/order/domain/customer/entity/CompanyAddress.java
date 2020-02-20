package org.order.domain.customer.entity;

import com.geekhalo.ddd.lite.domain.DomainEvent;
import com.geekhalo.ddd.lite.domain.ValidationHandler;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.vaueobject.phone.PhoneNumber;
import org.order.domain.customer.vaueobject.address.City;
import org.order.domain.customer.vaueobject.address.DetailAddress;
import org.order.domain.customer.vaueobject.address.Province;
import org.order.domain.customer.vaueobject.address.Region;
import org.order.domain.customer.vaueobject.id.AddressId;
import org.order.domain.customer.vaueobject.name.AddressName;
import org.order.domain.customer.vaueobject.name.ReceiverName;
import org.order.domain.customer.vaueobject.status.ReceiveStatus;
import org.order.domain.customer.vaueobject.status.SendAddressStatus;
import org.order.domain.customer.vaueobject.time.CreateTime;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @author "yangbiao"
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class CompanyAddress extends JpaEntity {
    private AddressId addressId;
    private AddressName addressName;
    private SendAddressStatus sendAddressStatus;
    private ReceiveStatus receiveStatus;
    private ReceiverName receiverName;
    private PhoneNumber receivePhone;
    private Province province;
    private City city;
    private Region region;
    private DetailAddress detailAddress;
    private CreateTime createTime;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }

}
