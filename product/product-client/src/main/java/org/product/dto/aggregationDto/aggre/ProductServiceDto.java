package org.product.dto.aggregationDto.aggre;

@Value
public class ProductServiceDto {
    private String UserId;
    private String productService;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductService(ValueObjectFactory.newInstance(ProductService.class, this.productService));
    }
}
