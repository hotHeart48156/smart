package org.product.dto.aggregationDto.aggre;

@Value
public class ProductPicDto {
    private String UserId;
    private String productPic;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setProductPic(ValueObjectFactory.newInstance(ProductPic.class, this.productPic));
    }
}
