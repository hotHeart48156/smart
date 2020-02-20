package org.product.domain.aggragate;

import com.geekhalo.ddd.lite.codegen.creator.GenCreator;
import com.geekhalo.ddd.lite.domain.Aggregate;
import com.geekhalo.ddd.lite.domain.DomainEvent;
import com.geekhalo.ddd.lite.domain.ValidationHandler;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.product.domain.entity.*;
import org.product.domain.valueobject.id.ProductId;

import java.util.Date;
import java.util.List;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ProductAdd extends JpaAggregate {
    private Product product;
    private Brand brand;
    private ProductCategory productCategory;
    private ProductAttribute productAttribute;
    private ProductFullReduction productFullReduction;
    private ProductLadder productLadder;
    private ProductOperateLog productOperateLog;
    private ProductSkuStock productSkuStock;
    private MemberPrice memberPrice;


}
