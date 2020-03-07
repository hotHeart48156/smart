package org.order.domain.entity;

import lombok.Data;
import org.order.domain.vaueobject.Growth;
import org.order.domain.vaueobject.Integration;
import org.order.domain.vaueobject.ProductPic;
import org.order.domain.vaueobject.attr.ProductAttributes;
import org.order.domain.vaueobject.attr.ProductSaleAttributes;
import org.order.domain.vaueobject.code.ProductSkuCode;
import org.order.domain.vaueobject.fee.CouponFee;
import org.order.domain.vaueobject.fee.IntegrationFee;
import org.order.domain.vaueobject.fee.PromotionFee;
import org.order.domain.vaueobject.fee.RealFee;
import org.order.domain.customer.vaueobject.id.*;
import org.order.domain.vaueobject.name.ProductName;
import org.order.domain.vaueobject.name.PromoteName;
import org.order.domain.vaueobject.price.ProductPrice;
import org.order.domain.vaueobject.product.ProductBrand;
import org.order.domain.vaueobject.sn.ProductSn;
import org.order.domain.vaueobject.time.CreateTime;
import org.order.domain.vaueobject.id.*;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */

@Data
@Entity
public class OrderItem implements org.order.domain.entity.Entity {
    //基本信息
    @EmbeddedId
private OrderItemId orderItemId;
    @Embedded
private OrderId orderId;
    //产品信息
    @Embedded
private ProductId productId;
    @Embedded
private ProductPic productPic;
    @Embedded
private ProductName productName;
    @Embedded
private ProductBrand productBrand;
    @Embedded
private ProductSn productSn;
    @Embedded
private ProductPrice productPrice;
    @Embedded
private ProductSkuId productSkuId;
    @Embedded
private ProductSkuCode productSkuCode;
    @Embedded
private ProductCategoryId productCategoryId;
    @Embedded
private ProductSaleAttributes productSaleAttributes;
    @Embedded
private ProductAttributes productAttributes;
    //营销信息
    @Embedded
private PromoteName promoteName;
    @Embedded
private PromotionFee promotionFee;
    @Embedded
private CouponFee couponFee;
    @Embedded
private IntegrationFee integrationFee;
    @Embedded
private RealFee realFee;
    @Embedded
private Integration giftIntegration;
    @Embedded
private Growth giftGrowth;
    @Embedded
private CreateTime createTime;


  

}
