package org.product.dto.aggregationDto.aggre;

@Value
public class PublishStatusDto {
    private String UserId;
    private String publishStatus;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setPublishStatus(ValueObjectFactory.newInstance(PublishStatus.class, this.publishStatus));
    }
}
