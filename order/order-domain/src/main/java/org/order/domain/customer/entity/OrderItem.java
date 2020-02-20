package org.order.domain.customer.entity;

import com.geekhalo.ddd.lite.domain.DomainEvent;
import com.geekhalo.ddd.lite.domain.ValidationHandler;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.vaueobject.Growth;
import org.order.domain.customer.vaueobject.Integration;
import org.order.domain.customer.vaueobject.product.ProductBrand;
import org.order.domain.customer.vaueobject.ProductPic;
import org.order.domain.customer.vaueobject.attr.ProductAttributes;
import org.order.domain.customer.vaueobject.attr.ProductSaleAttributes;
import org.order.domain.customer.vaueobject.code.ProductSkuCode;
import org.order.domain.customer.vaueobject.fee.CouponFee;
import org.order.domain.customer.vaueobject.fee.IntegrationFee;
import org.order.domain.customer.vaueobject.fee.PromotionFee;
import org.order.domain.customer.vaueobject.fee.RealFee;
import org.order.domain.customer.vaueobject.id.*;
import org.order.domain.customer.vaueobject.name.ProductName;
import org.order.domain.customer.vaueobject.name.PromoteName;
import org.order.domain.customer.vaueobject.price.ProductPrice;
import org.order.domain.customer.vaueobject.sn.OrderSn;
import org.order.domain.customer.vaueobject.sn.ProductSn;
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
public class OrderItem extends JpaEntity {
    private OrderItemId orderItemId;
    private OrderId orderId;
    private OrderSn orderSn;
    private ProductId productId;
    private ProductPic productPic;
    private ProductName productName;
    private ProductBrand productBrand;
    private ProductSn productSn;
    private ProductPrice productPrice;
    private ProductSkuId productSkuId;
    private ProductSkuCode productSkuCode;
    private ProductCategoryId productCategoryId;
    private ProductSaleAttributes productSaleAttributes;
    private ProductAttributes productAttributes;
    private PromoteName promoteName;
    private PromotionFee promotionFee;
    private CouponFee couponFee;
    private IntegrationFee integrationFee;
    private RealFee realFee;
    private Integration giftIntegration;
    private Growth giftGrowth;
    private CreateTime createTime;


    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }

}
