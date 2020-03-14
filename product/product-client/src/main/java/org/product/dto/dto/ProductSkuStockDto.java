package org.product.dto.dto;

@Data
public class ProductSkuStockDto {
    private String id;
    private String productId;
    private String skuCode;

    public void accept(ProductSkuStock productskustock) {
        productskustock.setId(ValueObjectFactory.newInstance(Id.class, id));
        productskustock.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        productskustock.setSkuCode(ValueObjectFactory.newInstance(SkuCode.class, skuCode));
    }
}
