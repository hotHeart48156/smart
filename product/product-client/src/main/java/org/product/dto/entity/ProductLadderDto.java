package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.ProductLadder;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.count.ProductCount;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.price.ProductPrice;
@Data
public class ProductLadderDto   extends AbstractEntityDto{
    private String id;
    private String productCount;
    private String productPrice;

    public void accept(ProductLadder productladder) {
        productladder.setId(ValueObjectFactory.newInstance(Id.class, id));
        productladder.setProductCount(ValueObjectFactory.newInstance(ProductCount.class, productCount));
        productladder.setProductPrice(ValueObjectFactory.newInstance(ProductPrice.class, productPrice));
    }
}
