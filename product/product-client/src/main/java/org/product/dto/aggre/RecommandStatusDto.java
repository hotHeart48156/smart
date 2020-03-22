package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Product;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.status.RecommandStatus;

@Data
public class RecommandStatusDto {
    private String ProductId;
    private String recommandStatus;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.ProductId.class, this.ProductId));
        product.setRecommandStatus(ValueObjectFactory.newInstance(RecommandStatus.class, this.recommandStatus));
    }
}
