package org.order.domain.entity;

import lombok.Data;
import org.order.domain.vaueobject.ProductPic;
import org.order.domain.vaueobject.attr.ProductAttributes;
import org.order.domain.vaueobject.attr.ProductSaleAttributes;
import org.order.domain.vaueobject.code.ProductSkuCode;
import org.order.domain.vaueobject.id.CartItemId;
import org.order.domain.vaueobject.id.ProductCategoryId;
import org.order.domain.vaueobject.id.ProductId;
import org.order.domain.vaueobject.id.ProductSkuId;
import org.order.domain.vaueobject.name.ProductName;
import org.order.domain.vaueobject.name.UserName;
import org.order.domain.vaueobject.product.ProductBrand;
import org.order.domain.vaueobject.sn.ProductSn;
import org.order.domain.vaueobject.status.DeleteStatus;
import org.order.domain.vaueobject.time.CreateTime;
import org.order.domain.vaueobject.time.ModifyTime;

import javax.persistence.Embedded;

/**
 * @author "yangbiao"
 */

@Data
public class CartItem implements Entity {
    @Embedded
private CartItemId cartItemId;
    @Embedded
private ProductId productId;
    @Embedded
private ProductSkuId productSkuId;
    @Embedded
private ProductSaleAttributes productSaleAttributes;
    @Embedded
private ProductPic productPic;
    @Embedded
private ProductName productName;
    @Embedded
private ProductSkuCode productSkuCode;
    @Embedded
private UserName memberUserName;
    @Embedded
private CreateTime createTime;
    @Embedded
private ModifyTime modifyTime;
    @Embedded
private DeleteStatus deleteStatus;
    @Embedded
private ProductCategoryId productCategoryId;
    @Embedded
private ProductBrand productBrand;
    @Embedded
private ProductSn productSn;
    @Embedded
private ProductAttributes productAttributes;
    @Embedded
private  Integer checked;


}
