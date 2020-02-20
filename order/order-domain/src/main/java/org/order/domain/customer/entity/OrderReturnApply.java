package org.order.domain.customer.entity;

import com.geekhalo.ddd.lite.domain.DomainEvent;
import com.geekhalo.ddd.lite.domain.ValidationHandler;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.vaueobject.*;
import org.order.domain.customer.vaueobject.attr.ProductAttributes;
import org.order.domain.customer.vaueobject.fee.ReturnFee;
import org.order.domain.customer.vaueobject.id.AddressId;
import org.order.domain.customer.vaueobject.id.OrderId;
import org.order.domain.customer.vaueobject.id.OrderReturnApplyId;
import org.order.domain.customer.vaueobject.id.ProductId;
import org.order.domain.customer.vaueobject.name.ProductName;
import org.order.domain.customer.vaueobject.name.UserName;
import org.order.domain.customer.vaueobject.phone.PhoneNumber;
import org.order.domain.customer.vaueobject.price.ProductPrice;
import org.order.domain.customer.vaueobject.price.RealPrice;
import org.order.domain.customer.vaueobject.product.ProductBrand;
import org.order.domain.customer.vaueobject.quantity.ReturnQuantity;
import org.order.domain.customer.vaueobject.sn.OrderSn;
import org.order.domain.customer.vaueobject.status.ReturnStatus;
import org.order.domain.customer.vaueobject.time.CreateTime;
import org.order.domain.customer.vaueobject.time.HandleTime;
import org.order.domain.customer.vaueobject.time.ReceiverTime;

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
public class OrderReturnApply extends JpaEntity {
    private OrderReturnApplyId orderReturnApplyId;
    private OrderId orderId;
    private AddressId companyAddressId;
    private ProductId productId;
    private OrderSn orderSn;
    private CreateTime createTime;
    private UserName memberUserName;
    private ReturnFee returnFee;
    private UserName returnName;
    private PhoneNumber returnPhone;
    private ReturnStatus returnStatus;
    private HandleTime handleTime;
    private ProductPic productPic;
    private ProductName productName;
    private ProductBrand productBrand;
    private ProductAttributes productAttributes;
    private ReturnQuantity returnQuantity;
    private ProductPrice productPrice;
    private RealPrice productRealPrice;
    private Reason reason;
    private Description description;
    private ProofPics proofPics;
    private Note handleNote;
    private OperateMan handleMan;
    private ReceiverPerson receiverPerson;
    private ReceiverTime receiverTime;
    private Note receiverNote;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }

}
