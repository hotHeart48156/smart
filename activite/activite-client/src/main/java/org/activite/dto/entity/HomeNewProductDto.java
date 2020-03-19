package org.activite.dto.entity;

import lombok.Data;
import org.activite.domain.entity.HomeNewProduct;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.id.ProductId;
import org.activite.domain.valueobject.name.ProductName;
import org.activite.domain.valueobject.status.RecommendStatus;

@Data
public class HomeNewProductDto {
    private String productId;
    private String productName;
    private String recommendStatus;

    public void accept(HomeNewProduct homenewproduct) {
        homenewproduct.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        homenewproduct.setProductName(ValueObjectFactory.newInstance(ProductName.class, productName));
        homenewproduct.setRecommendStatus(ValueObjectFactory.newInstance(RecommendStatus.class, recommendStatus));
    }
}
