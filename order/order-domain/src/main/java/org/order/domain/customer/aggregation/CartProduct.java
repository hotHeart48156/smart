package org.order.domain.customer.aggregation;

import com.geekhalo.ddd.lite.codegen.EnableGenForAggregate;
import com.geekhalo.ddd.lite.codegen.application.GenMixedApplication;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.vaueobject.attr.ProductAttributes;
import org.order.domain.customer.vaueobject.id.ProductSkuId;

import java.util.Date;
import java.util.List;

/**
 * @author "yangbiao"
 */

/**
 * 商品信息的规格
 *
 * @author OMEN
 */
@EqualsAndHashCode(callSuper = true)
@EnableGenForAggregate
@GenMixedApplication(implementName = "BaseAuthApplication")
@Data
@AllArgsConstructor
/**
 * 商品信息的规格
 */
public class CartProduct extends JpaAggregate {
    private List<ProductAttributes> productAttributes;
    private List<ProductSkuId> productSkuIds;
    private Date Date;

    @Override
    public java.util.Date getCreateTime() {
        return this.getCreateTime();
    }
}
