package org.activite.dto.entity;

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
