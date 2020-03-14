package org.activite.dto.entity;

@Data
public class HomeBrandDto {
    private String brandId;
    private String brandName;
    private String recommendStatus;

    public void accept(HomeBrand homebrand) {
        homebrand.setBrandId(ValueObjectFactory.newInstance(BrandId.class, brandId));
        homebrand.setBrandName(ValueObjectFactory.newInstance(BrandName.class, brandName));
        homebrand.setRecommendStatus(ValueObjectFactory.newInstance(RecommendStatus.class, recommendStatus));
    }
}
