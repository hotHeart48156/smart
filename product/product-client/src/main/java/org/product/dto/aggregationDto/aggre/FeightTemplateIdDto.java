package org.product.dto.aggregationDto.aggre;

@Value
public class FeightTemplateIdDto {
    private String UserId;
    private String feightTemplateId;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setFeightTemplateId(ValueObjectFactory.newInstance(FeightTemplateId.class, this.feightTemplateId));
    }
}
