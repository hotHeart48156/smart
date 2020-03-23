package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.ProductFullReduction;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;
import org.product.domain.valueobject.price.FullPrice;
import org.product.domain.valueobject.price.ReducePrice;

@Data
public class ProductFullReductionDto {
    private String id;
    private String productId;
    private String fullPrice;
    private String reducePrice;

    public void accept(ProductFullReduction productfullreduction) {
        productfullreduction.setId(ValueObjectFactory.newInstance(Id.class, id));
        productfullreduction.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        productfullreduction.setFullPrice(ValueObjectFactory.newInstance(FullPrice.class, fullPrice));
        productfullreduction.setReducePrice(ValueObjectFactory.newInstance(ReducePrice.class, reducePrice));
    }
}
