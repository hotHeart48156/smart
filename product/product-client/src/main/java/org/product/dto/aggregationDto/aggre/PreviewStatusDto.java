package org.product.dto.aggregationDto.aggre;

@Value
public class PreviewStatusDto {
    private String UserId;
    private String previewStatus;

    public void accept(Product product) {
        product.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        product.setPreviewStatus(ValueObjectFactory.newInstance(PreviewStatus.class, this.previewStatus));
    }
}
