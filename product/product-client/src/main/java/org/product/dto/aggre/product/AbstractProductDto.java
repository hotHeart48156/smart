package org.product.dto.aggre.product;

import org.product.domain.aggragate.Product;
import org.product.dto.AbstractDto;

/**
 * @author yangbiao
 */

public abstract class AbstractProductDto extends AbstractDto   {
    private String productId;
    public void accept(Product product){
        if (product.getProductId().getProductId().equals(productId)){
            execute(product);
        }
    }
    public abstract void execute(Product product);
}
