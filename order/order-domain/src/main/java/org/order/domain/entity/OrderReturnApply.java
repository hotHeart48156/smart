package org.order.domain.entity;

import lombok.Data;
import org.order.domain.vaueobject.attr.ProductAttributes;
import org.order.domain.vaueobject.fee.ReturnFee;
import org.order.domain.vaueobject.id.AddressId;
import org.order.domain.vaueobject.id.OrderId;
import org.order.domain.vaueobject.id.OrderReturnApplyId;
import org.order.domain.vaueobject.id.ProductId;
import org.order.domain.vaueobject.name.ProductName;
import org.order.domain.vaueobject.name.UserName;
import org.order.domain.vaueobject.phone.PhoneNumber;
import org.order.domain.vaueobject.price.ProductPrice;
import org.order.domain.vaueobject.price.RealPrice;
import org.order.domain.vaueobject.product.ProductBrand;
import org.order.domain.vaueobject.quantity.ReturnQuantity;
import org.order.domain.vaueobject.sn.OrderSn;
import org.order.domain.vaueobject.status.ReturnStatus;
import org.order.domain.vaueobject.time.CreateTime;
import org.order.domain.vaueobject.time.HandleTime;
import org.order.domain.vaueobject.time.ReceiverTime;
import org.order.domain.vaueobject.*;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */

@Data
@Entity
public class OrderReturnApply implements org.order.domain.entity.Entity {
    @EmbeddedId
private OrderReturnApplyId orderReturnApplyId;
    @Embedded
private OrderId orderId;
    @Embedded
private AddressId companyAddressId;
    @Embedded
private ProductId productId;
    @Embedded
private OrderSn orderSn;
    @Embedded
private CreateTime createTime;
    @Embedded
private UserName memberUserName;
    @Embedded
private ReturnFee returnFee;
    @Embedded
private  UserName returnName;
    @Embedded
private PhoneNumber returnPhone;
    @Embedded
private ReturnStatus returnStatus;
    @Embedded
private HandleTime handleTime;
    @Embedded
private ProductPic productPic;
    @Embedded
private ProductName productName;
    @Embedded
private ProductBrand productBrand;
    @Embedded
private ProductAttributes productAttributes;
    @Embedded
private ReturnQuantity returnQuantity;
    @Embedded
private ProductPrice productPrice;
    @Embedded
private RealPrice productRealPrice;
    @Embedded
private Reason reason;
    @Embedded
private Description description;
    @Embedded
private ProofPics proofPics;
    @Embedded
private Note handleNote;
    @Embedded
private  OperateMan handleMan;
    @Embedded
private  ReceiverPerson receiverPerson;
    @Embedded
private ReceiverTime receiverTime;
    @Embedded
private  Note receiverNote;



}
