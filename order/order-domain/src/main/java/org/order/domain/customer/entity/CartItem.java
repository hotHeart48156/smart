package org.order.domain.customer.entity;

import com.geekhalo.ddd.lite.domain.DomainEvent;
import com.geekhalo.ddd.lite.domain.ValidationHandler;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaEntity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import org.order.domain.customer.vaueobject.product.ProductBrand;
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
import org.order.domain.customer.vaueobject.sn.ProductSn;
import org.order.domain.customer.vaueobject.status.DeleteStatus;
import org.order.domain.customer.vaueobject.time.CreateTime;
import org.order.domain.customer.vaueobject.time.ModifyTime;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @author "yangbiao"
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class CartItem extends JpaEntity {
    private CartItemId cartItemId;
    private ProductId productId;
    private ProductSkuId productSkuId;
    private ProductSaleAttributes productSaleAttributes;
    private ProductPic productPic;
    private ProductName productName;
    private ProductSkuCode productSkuCode;
    private UserName memberUserName;
    private CreateTime createTime;
    private ModifyTime modifyTime;
    private DeleteStatus deleteStatus;
    private ProductCategoryId productCategoryId;
    private ProductBrand productBrand;
    private ProductSn productSn;
    private ProductAttributes productAttributes;
    private Integer checked;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }
}
