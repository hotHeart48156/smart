package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Brand;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.status.ShowStatus;

@Data
public class ShowStatusDto {
    private String ProductId;
    private String showStatus;

    public void accept(Brand brand) {
        brand.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        brand.setShowStatus(ValueObjectFactory.newInstance(ShowStatus.class, this.showStatus));
    }
}
