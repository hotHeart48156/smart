package org.product.dto.aggregationDto.aggre;

@Value
public class IdDto {
    private String UserId;
    private String brandId;

    public void accept(Brand brand) {
        brand.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        brand.setId(ValueObjectFactory.newInstance(Id.class, this.brandId));
    }
}
