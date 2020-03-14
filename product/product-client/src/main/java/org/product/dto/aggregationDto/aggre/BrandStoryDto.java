package org.product.dto.aggregationDto.aggre;

@Value
public class BrandStoryDto {
    private String UserId;
    private String brandStory;

    public void accept(Brand brand) {
        brand.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        brand.setBrandStory(ValueObjectFactory.newInstance(BrandStory.class, this.brandStory));
    }
}
