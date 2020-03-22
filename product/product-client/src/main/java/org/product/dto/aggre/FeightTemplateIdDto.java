package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.FeightTemplateId;
@Data
public class FeightTemplateIdDto {
    private String ProductId;
    private String feightTemplateId;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setFeightTemplateId(ValueObjectFactory.newInstance(FeightTemplateId.class, this.feightTemplateId));
    }
}
