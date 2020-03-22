package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.status.DeleteStatus;

import org.product.domain.aggragate.Product;
@Data
public class DeleteStatusDto {
    private String ProductId;
    private String deleteStatus;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setDeleteStatus(ValueObjectFactory.newInstance(DeleteStatus.class, this.deleteStatus));
    }
}
