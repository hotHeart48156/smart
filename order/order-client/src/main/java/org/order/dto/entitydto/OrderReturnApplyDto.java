package org.order.dto.entitydto;

import lombok.Data;
import org.order.domain.entity.OrderReturnApply;
import org.order.domain.vaueobject.*;
import org.order.domain.vaueobject.attr.ProductAttributes;
import org.order.domain.vaueobject.fee.ReturnFee;
import org.order.domain.vaueobject.id.AddressId;
import org.order.domain.vaueobject.id.OrderId;
import org.order.domain.vaueobject.id.OrderReturnApplyId;
import org.order.domain.vaueobject.id.ProductId;
import org.order.domain.vaueobject.name.ProductName;
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

@Data
public class OrderReturnApplyDto   extends AbstractEntityDto{
    private String orderReturnApplyId;
    private String orderId;
    private String companyAddressId;
    private String productId;
    private String orderSn;
    private String createTime;
    private String memberUserName;
    private String returnFee;
    private String UserName;
    private String returnPhone;
    private String returnStatus;
    private String handleTime;
    private String productPic;
    private String productName;
    private String productBrand;
    private String productAttributes;
    private String returnQuantity;
    private String productPrice;
    private String productRealPrice;
    private String reason;
    private String description;
    private String proofPics;
    private String handleNote;
    private String operateMan;
    private String receiverPerson;
    private String receiverTime;
    private String note;

    public void accept(OrderReturnApply orderreturnapply) {
        orderreturnapply.setOrderReturnApplyId(ValueObjectFactory.newInstance(OrderReturnApplyId.class, orderReturnApplyId));
        orderreturnapply.setOrderId(ValueObjectFactory.newInstance(OrderId.class, orderId));
        orderreturnapply.setCompanyAddressId(ValueObjectFactory.newInstance(AddressId.class, companyAddressId));
        orderreturnapply.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        orderreturnapply.setOrderSn(ValueObjectFactory.newInstance(OrderSn.class, orderSn));
        orderreturnapply.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
        orderreturnapply.setMemberUserName(ValueObjectFactory.newInstance(org.order.domain.vaueobject.name.UserName.class, memberUserName));
        orderreturnapply.setReturnFee(ValueObjectFactory.newInstance(ReturnFee.class, returnFee));
        orderreturnapply.setMemberUserName(ValueObjectFactory.newInstance(org.order.domain.vaueobject.name.UserName.class, UserName));
        orderreturnapply.setReturnPhone(ValueObjectFactory.newInstance(PhoneNumber.class, returnPhone));
        orderreturnapply.setReturnStatus(ValueObjectFactory.newInstance(ReturnStatus.class, returnStatus));
        orderreturnapply.setHandleTime(ValueObjectFactory.newInstance(HandleTime.class, handleTime));
        orderreturnapply.setProductPic(ValueObjectFactory.newInstance(ProductPic.class, productPic));
        orderreturnapply.setProductName(ValueObjectFactory.newInstance(ProductName.class, productName));
        orderreturnapply.setProductBrand(ValueObjectFactory.newInstance(ProductBrand.class, productBrand));
        orderreturnapply.setProductAttributes(ValueObjectFactory.newInstance(ProductAttributes.class, productAttributes));
        orderreturnapply.setReturnQuantity(ValueObjectFactory.newInstance(ReturnQuantity.class, returnQuantity));
        orderreturnapply.setProductPrice(ValueObjectFactory.newInstance(ProductPrice.class, productPrice));
        orderreturnapply.setProductRealPrice(ValueObjectFactory.newInstance(RealPrice.class, productRealPrice));
        orderreturnapply.setReason(ValueObjectFactory.newInstance(Reason.class, reason));
        orderreturnapply.setDescription(ValueObjectFactory.newInstance(Description.class, description));
        orderreturnapply.setProofPics(ValueObjectFactory.newInstance(ProofPics.class, proofPics));
        orderreturnapply.setHandleNote(ValueObjectFactory.newInstance(org.order.domain.vaueobject.Note.class, handleNote));
        orderreturnapply.setHandleMan(ValueObjectFactory.newInstance(org.order.domain.vaueobject.OperateMan.class, operateMan));
        orderreturnapply.setReceiverPerson(ValueObjectFactory.newInstance(ReceiverPerson.class, receiverPerson));
        orderreturnapply.setReceiverTime(ValueObjectFactory.newInstance(ReceiverTime.class, receiverTime));
        orderreturnapply.setReceiverNote(ValueObjectFactory.newInstance(org.order.domain.vaueobject.Note.class, note));
    }
}
