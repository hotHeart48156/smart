package org.product.dtoo.aggdto;

@Data
public class ProductServiceDto {
    private String ProductId;
    private String productService;

    public void accept(Product product) {
        product.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        product.setProductService(ValueObjectFactory.newInstance(ProductService.class, this.productService));
    }
}
