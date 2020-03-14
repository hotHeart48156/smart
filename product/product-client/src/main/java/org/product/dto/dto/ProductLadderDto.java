package org.product.dto.dto;

@Data
public class ProductLadderDto {
    private String id;
    private String productId;
    private String productCount;
    private String productPrice;

    public void accept(ProductLadder productladder) {
        productladder.setId(ValueObjectFactory.newInstance(Id.class, id));
        productladder.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        productladder.setProductCount(ValueObjectFactory.newInstance(ProductCount.class, productCount));
        productladder.setProductPrice(ValueObjectFactory.newInstance(ProductPrice.class, productPrice));
    }
}
