package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Brand;
import org.product.domain.valueobject.ProductComment;
import org.product.domain.valueobject.ValueObjectFactory;

@Data
public class ProductCommentDto {
    private String ProductId;
    private String productComment;

    public void accept(Brand brand) {
        brand.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        brand.setProductComment(ValueObjectFactory.newInstance(ProductComment.class, this.productComment));
    }
}
