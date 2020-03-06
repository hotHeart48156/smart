package org.order.domain.customer.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.vaueobject.ProductPic;
import org.order.domain.customer.vaueobject.attr.ProductAttributes;
import org.order.domain.customer.vaueobject.attr.ProductSaleAttributes;
import org.order.domain.customer.vaueobject.code.ProductSkuCode;
import org.order.domain.customer.vaueobject.id.CartItemId;
import org.order.domain.customer.vaueobject.id.ProductCategoryId;
import org.order.domain.customer.vaueobject.id.ProductId;
import org.order.domain.customer.vaueobject.id.ProductSkuId;
import org.order.domain.customer.vaueobject.name.ProductName;
import org.order.domain.customer.vaueobject.name.UserName;
import org.order.domain.customer.vaueobject.product.ProductBrand;
import org.order.domain.customer.vaueobject.sn.ProductSn;
import org.order.domain.customer.vaueobject.status.DeleteStatus;
import org.order.domain.customer.vaueobject.time.CreateTime;
import org.order.domain.customer.vaueobject.time.ModifyTime;

import javax.persistence.Embedded;
import java.util.Date;

/**
 * @author "yangbiao"
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class CartItem implements Entity {
    @Embedded
private  CartItemId cartItemId;
    @Embedded
private  ProductId productId;
    @Embedded
private  ProductSkuId productSkuId;
    @Embedded
private  ProductSaleAttributes productSaleAttributes;
    @Embedded
private  ProductPic productPic;
    @Embedded
private  ProductName productName;
    @Embedded
private  ProductSkuCode productSkuCode;
    @Embedded
private  UserName memberUserName;
    @Embedded
private  CreateTime createTime;
    @Embedded
private  ModifyTime modifyTime;
    @Embedded
private  DeleteStatus deleteStatus;
    @Embedded
private  ProductCategoryId productCategoryId;
    @Embedded
private  ProductBrand productBrand;
    @Embedded
private  ProductSn productSn;
    @Embedded
private  ProductAttributes productAttributes;
    @Embedded
private  Integer checked;


}
