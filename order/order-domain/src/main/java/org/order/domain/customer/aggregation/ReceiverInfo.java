package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.codegen.EnableGenForAggregate;
import com.geekhalo.ddd.lite.codegen.application.GenMixedApplication;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.entity.Address;
import org.order.domain.customer.vaueobject.code.PostCode;
import org.order.domain.customer.vaueobject.id.OrderId;
import org.order.domain.customer.vaueobject.name.ReceiverName;
import org.order.domain.customer.vaueobject.phone.PhoneNumber;
import org.order.domain.customer.vaueobject.status.ReceiveStatus;
import org.order.domain.customer.vaueobject.time.CreateTime;

import java.util.Date;

/**
 * @author "yangbiao"
 */

/**
 * 收货人信息
 */
@EqualsAndHashCode(callSuper = true)
@EnableGenForAggregate
@GenMixedApplication(implementName = "BaseAuthApplication")
@Data
@AllArgsConstructor
public class ReceiverInfo extends JpaAggregate {
    private CreateTime createTime;
    private OrderId orderId;
    private ReceiverName receiverName;
    private PhoneNumber receiverPhone;
    private PostCode receiverPostcode;
    private Address receiverAddress;
    private ReceiveStatus receiveStatus;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }
}
