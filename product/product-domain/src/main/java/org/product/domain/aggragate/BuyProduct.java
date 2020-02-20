package org.product.domain.aggragate;

import com.geekhalo.ddd.lite.domain.Aggregate;
import com.geekhalo.ddd.lite.domain.DomainEvent;
import com.geekhalo.ddd.lite.domain.ValidationHandler;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaAggregate;
import org.product.domain.entity.*;
import org.product.domain.valueobject.id.ProductId;

import java.util.Date;
import java.util.List;

/**
 * @author "yangbiao"
 */
public class BuyProduct extends JpaAggregate {
    private Product product;
    private ProductAttribute productAttribute;
    private Brand brand;
    private ProductSkuStock productSkuStock;
    private MemberPrice memberPrice;
    private ProductLadder productLadder;

}
