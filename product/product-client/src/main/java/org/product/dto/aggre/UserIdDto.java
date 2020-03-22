package org.product.dto.aggre;

import org.product.domain.aggragate.Product;
@Data
public class UserIdDto {
    private String ProductId;
    private String userId;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.userId));
    }
}
