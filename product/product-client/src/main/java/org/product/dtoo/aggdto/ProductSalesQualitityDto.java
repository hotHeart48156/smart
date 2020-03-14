package org.product.dtoo.aggdto;

@Data
public class ProductSalesQualitityDto {
    private String ProductId;
    private String productSalesQualitity;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductSalesQualitity(ValueObjectFactory.newInstance(ProductSalesQualitity.class, this.productSalesQualitity));
    }
}
