package org.product.dto.aggregationDto.aggre;

@Value
public class ShowStatusDto {
    private String UserId;
    private String showStatus;

    public void accept(Brand brand) {
        brand.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        brand.setShowStatus(ValueObjectFactory.newInstance(ShowStatus.class, this.showStatus));
    }
}
