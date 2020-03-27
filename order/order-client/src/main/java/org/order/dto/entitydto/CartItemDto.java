package org.order.dto.entitydto;

import lombok.Data;
import org.order.domain.entity.CartItem;
import org.order.domain.vaueobject.ProductPic;
import org.order.domain.vaueobject.ValueObjectFactory;
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

@Data
public class CartItemDto   extends AbstractEntityDto{
    private String cartItemId;
    private String productId;
    private String productSkuId;
    private String productSaleAttributes;
    private String productPic;
    private String productName;
    private String productSkuCode;
    private String memberUserName;
    private String createTime;
    private String modifyTime;
    private String deleteStatus;
    private String productCategoryId;
    private String productBrand;
    private String productSn;
    private String productAttributes;

    public void accept(CartItem cartitem) {
        cartitem.setCartItemId(ValueObjectFactory.newInstance(CartItemId.class, cartItemId));
        cartitem.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        cartitem.setProductSkuId(ValueObjectFactory.newInstance(ProductSkuId.class, productSkuId));
        cartitem.setProductSaleAttributes(ValueObjectFactory.newInstance(ProductSaleAttributes.class, productSaleAttributes));
        cartitem.setProductPic(ValueObjectFactory.newInstance(ProductPic.class, productPic));
        cartitem.setProductName(ValueObjectFactory.newInstance(ProductName.class, productName));
        cartitem.setProductSkuCode(ValueObjectFactory.newInstance(ProductSkuCode.class, productSkuCode));
        cartitem.setMemberUserName(ValueObjectFactory.newInstance(UserName.class, memberUserName));
        cartitem.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
        cartitem.setModifyTime(ValueObjectFactory.newInstance(ModifyTime.class, modifyTime));
        cartitem.setDeleteStatus(ValueObjectFactory.newInstance(DeleteStatus.class, deleteStatus));
        cartitem.setProductCategoryId(ValueObjectFactory.newInstance(ProductCategoryId.class, productCategoryId));
        cartitem.setProductBrand(ValueObjectFactory.newInstance(ProductBrand.class, productBrand));
        cartitem.setProductSn(ValueObjectFactory.newInstance(ProductSn.class, productSn));
        cartitem.setProductAttributes(ValueObjectFactory.newInstance(ProductAttributes.class, productAttributes));
    }
}
