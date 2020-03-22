package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.status.PublishStatus;

@Data
public class PublishStatusDto {
    private String ProductId;
    private String publishStatus;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setPublishStatus(ValueObjectFactory.newInstance(PublishStatus.class, this.publishStatus));
    }
}
