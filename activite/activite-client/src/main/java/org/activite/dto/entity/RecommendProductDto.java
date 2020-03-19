package org.activite.dto.entity;

import lombok.Data;
import org.activite.domain.entity.RecommendProduct;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.id.ProductId;
import org.activite.domain.valueobject.name.ProductName;
import org.activite.domain.valueobject.status.RecommendStatus;

@Data
public class RecommendProductDto {
    private String productId;
    private String productName;
    private String recommendStatus;

    public void accept(RecommendProduct recommendproduct) {
        recommendproduct.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        recommendproduct.setProductName(ValueObjectFactory.newInstance(ProductName.class, productName));
        recommendproduct.setRecommendStatus(ValueObjectFactory.newInstance(RecommendStatus.class, recommendStatus));
    }
}
