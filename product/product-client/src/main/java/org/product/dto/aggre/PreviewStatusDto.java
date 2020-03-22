package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.status.PreviewStatus;

@Data
public class PreviewStatusDto {
    private String ProductId;
    private String previewStatus;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setPreviewStatus(ValueObjectFactory.newInstance(PreviewStatus.class, this.previewStatus));
    }
}
