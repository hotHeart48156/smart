package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.ProductSkuStock;
import org.product.domain.valueobject.SkuCode;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;
@Data
public class ProductSkuStockDto   extends AbstractEntityDto{
    private String id;
    private String productId;
    private String skuCode;

    public void accept(ProductSkuStock productskustock) {
        productskustock.setId(ValueObjectFactory.newInstance(Id.class, id));
        productskustock.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        productskustock.setSkuCode(ValueObjectFactory.newInstance(SkuCode.class, skuCode));
    }
}
