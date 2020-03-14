package org.product.dto.aggdto;

@Data
public class ProductStockDto {
    private String ProductId;
    private String productStock;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductStock(ValueObjectFactory.newInstance(ProductStock.class, this.productStock));
    }
}
