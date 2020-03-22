package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.status.NewStatus;

@Data
public class NewStatusDto {
    private String ProductId;
    private String newStatus;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setNewStatus(ValueObjectFactory.newInstance(NewStatus.class, this.newStatus));
    }
}
