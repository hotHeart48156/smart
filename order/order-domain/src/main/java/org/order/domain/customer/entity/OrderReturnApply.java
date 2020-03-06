package org.order.domain.customer.entity;

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

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class OrderReturnApply implements org.order.domain.customer.entity.Entity {
    @EmbeddedId
private  OrderReturnApplyId orderReturnApplyId;
    @Embedded
private  OrderId orderId;
    @Embedded
private  AddressId companyAddressId;
    @Embedded
private  ProductId productId;
    @Embedded
private  OrderSn orderSn;
    @Embedded
private  CreateTime createTime;
    @Embedded
private  UserName memberUserName;
    @Embedded
private  ReturnFee returnFee;
    @Embedded
private  UserName returnName;
    @Embedded
private  PhoneNumber returnPhone;
    @Embedded
private  ReturnStatus returnStatus;
    @Embedded
private  HandleTime handleTime;
    @Embedded
private  ProductPic productPic;
    @Embedded
private  ProductName productName;
    @Embedded
private  ProductBrand productBrand;
    @Embedded
private  ProductAttributes productAttributes;
    @Embedded
private  ReturnQuantity returnQuantity;
    @Embedded
private  ProductPrice productPrice;
    @Embedded
private  RealPrice productRealPrice;
    @Embedded
private  Reason reason;
    @Embedded
private  Description description;
    @Embedded
private  ProofPics proofPics;
    @Embedded
private  Note handleNote;
    @Embedded
private  OperateMan handleMan;
    @Embedded
private  ReceiverPerson receiverPerson;
    @Embedded
private  ReceiverTime receiverTime;
    @Embedded
private  Note receiverNote;



}
