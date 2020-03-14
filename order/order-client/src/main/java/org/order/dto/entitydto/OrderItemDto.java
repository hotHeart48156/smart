package org.order.dto.entitydto;

import lombok.Data;
import org.order.domain.entity.OrderItem;
import org.order.domain.vaueobject.Growth;
import org.order.domain.vaueobject.ProductPic;
import org.order.domain.vaueobject.ValueObjectFactory;
import org.order.domain.vaueobject.attr.ProductAttributes;
import org.order.domain.vaueobject.attr.ProductSaleAttributes;
import org.order.domain.vaueobject.code.ProductSkuCode;
import org.order.domain.vaueobject.fee.CouponFee;
import org.order.domain.vaueobject.fee.IntegrationFee;
import org.order.domain.vaueobject.fee.PromotionFee;
import org.order.domain.vaueobject.fee.RealFee;
import org.order.domain.vaueobject.id.*;
import org.order.domain.vaueobject.name.ProductName;
import org.order.domain.vaueobject.name.PromoteName;
import org.order.domain.vaueobject.price.ProductPrice;
import org.order.domain.vaueobject.product.ProductBrand;
import org.order.domain.vaueobject.sn.ProductSn;
import org.order.domain.vaueobject.time.CreateTime;

/**
 * @author yangbiao
 */
@Data
public class OrderItemDto {
    private String orderItemId;
    private String orderId;
    private String productId;
    private String productPic;
    private String productName;
    private String productBrand;
    private String productSn;
    private String productPrice;
    private String productSkuId;
    private String productSkuCode;
    private String productCategoryId;
    private String productSaleAttributes;
    private String productAttributes;
    private String promoteName;
    private String promotionFee;
    private String couponFee;
    private String integrationFee;
    private String realFee;
    private String giftIntegration;
    private String giftGrowth;
    private String createTime;

    public void accept(OrderItem orderitem) {
        orderitem.setOrderItemId(ValueObjectFactory.newInstance(OrderItemId.class, orderItemId));
        orderitem.setOrderId(ValueObjectFactory.newInstance(OrderId.class, orderId));
        orderitem.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        orderitem.setProductPic(ValueObjectFactory.newInstance(ProductPic.class, productPic));
        orderitem.setProductName(ValueObjectFactory.newInstance(ProductName.class, productName));
        orderitem.setProductBrand(ValueObjectFactory.newInstance(ProductBrand.class, productBrand));
        orderitem.setProductSn(ValueObjectFactory.newInstance(ProductSn.class, productSn));
        orderitem.setProductPrice(ValueObjectFactory.newInstance(ProductPrice.class, productPrice));
        orderitem.setProductSkuId(ValueObjectFactory.newInstance(ProductSkuId.class, productSkuId));
        orderitem.setProductSkuCode(ValueObjectFactory.newInstance(ProductSkuCode.class, productSkuCode));
        orderitem.setProductCategoryId(ValueObjectFactory.newInstance(ProductCategoryId.class, productCategoryId));
        orderitem.setProductSaleAttributes(ValueObjectFactory.newInstance(ProductSaleAttributes.class, productSaleAttributes));
        orderitem.setProductAttributes(ValueObjectFactory.newInstance(ProductAttributes.class, productAttributes));
        orderitem.setPromoteName(ValueObjectFactory.newInstance(PromoteName.class, promoteName));
        orderitem.setPromotionFee(ValueObjectFactory.newInstance(PromotionFee.class, promotionFee));
        orderitem.setCouponFee(ValueObjectFactory.newInstance(CouponFee.class, couponFee));
        orderitem.setIntegrationFee(ValueObjectFactory.newInstance(IntegrationFee.class, integrationFee));
        orderitem.setRealFee(ValueObjectFactory.newInstance(RealFee.class, realFee));
        orderitem.setGiftGrowth(ValueObjectFactory.newInstance(Growth.class, giftGrowth));
        orderitem.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
    }
}
