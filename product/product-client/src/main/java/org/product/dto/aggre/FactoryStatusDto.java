package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Brand;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.status.FactoryStatus;

import org.product.domain.aggragate.Product;
@Data
public class FactoryStatusDto {
    private String ProductId;
    private String factoryStatus;

    public void accept(Brand brand) {
        brand.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        brand.setFactoryStatus(ValueObjectFactory.newInstance(FactoryStatus.class, this.factoryStatus));
    }
}
