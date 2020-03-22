package org.product.dto.aggre;

import org.product.domain.aggragate.Product;
@Data
public class ProductPicDto {
    private String ProductId;
    private String productPic;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductPic(ValueObjectFactory.newInstance(ProductPic.class, this.productPic));
    }
}
