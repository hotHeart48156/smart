package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.codegen.EnableGenForAggregate;
import com.geekhalo.ddd.lite.codegen.application.GenMixedApplication;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.order.domain.customer.entity.CompanyAddress;
import org.order.domain.customer.vaueobject.Note;
import org.order.domain.customer.vaueobject.ReceivedMan;
import org.order.domain.customer.vaueobject.fee.ReturnFee;
import org.order.domain.customer.vaueobject.id.OrderId;
import org.order.domain.customer.vaueobject.status.OrderStatus;
import org.order.domain.customer.vaueobject.time.CreateTime;
import org.order.domain.customer.vaueobject.time.HandleTime;

import java.util.Date;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@EnableGenForAggregate
@GenMixedApplication(implementName = "BaseAuthApplication")
@Data
@AllArgsConstructor
public class ReceivedStatusUpdate extends JpaAggregate {
    private OrderId orderId;
    private CompanyAddress companyAddress;
    private ReturnFee returnFee;
    private Note receivedNote;
    private HandleTime handleTime;
    private ReceivedMan receivedMan;
    private OrderStatus orderStatus;
    private Note handleNote;
    private CreateTime createTime;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }

}
