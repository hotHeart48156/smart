package org.activite.dto.entity;

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
