package org.product.dto.aggregationDto.aggre;

import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.status.DeleteStatus;

@Value
public class DeleteStatusDto {
    private String UserId;
    private String deleteStatus;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.UserId.class, this.UserId));
        product.setDeleteStatus(ValueObjectFactory.newInstance(DeleteStatus.class, this.deleteStatus));
    }
}
