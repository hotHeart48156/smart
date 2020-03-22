package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Brand;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ProductLogo;
import org.product.domain.valueobject.ValueObjectFactory;

@Data
public class ProductLogoDto {
    private String ProductId;
    private String productLogo;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setProductLogo(ValueObjectFactory.newInstance(ProductLogo.class, this.productLogo));
    }
}
