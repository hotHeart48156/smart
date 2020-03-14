package org.product.dto.aggregationDto.aggre;

@Value
public class ProductStockDto {
    private String UserId;
    private String productStock;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductStock(ValueObjectFactory.newInstance(ProductStock.class, this.productStock));
    }
}
