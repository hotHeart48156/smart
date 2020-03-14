package org.product.dtoo.aggdto;

@Data
public class BrandStoryDto {
    private String ProductId;
    private String brandStory;

    public void accept(Brand brand) {
        brand.setProductId(ValueObjectFactory.newInstance(ProductId.class, this.ProductId));
        brand.setBrandStory(ValueObjectFactory.newInstance(BrandStory.class, this.brandStory));
    }
}
