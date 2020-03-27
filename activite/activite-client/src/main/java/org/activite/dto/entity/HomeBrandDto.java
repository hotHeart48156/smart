package org.activite.dto.entity;

import lombok.Data;
import org.activite.domain.entity.HomeBrand;
import org.activite.domain.valueobject.ValueObjectFactory;
import org.activite.domain.valueobject.id.BrandId;
import org.activite.domain.valueobject.name.BrandName;
import org.activite.domain.valueobject.status.RecommendStatus;

@Data
public class HomeBrandDto   extends AbstractEntityDto{
    private String brandId;
    private String brandName;
    private String recommendStatus;

    public void accept(HomeBrand homebrand) {
        homebrand.setBrandId(ValueObjectFactory.newInstance(BrandId.class, brandId));
        homebrand.setBrandName(ValueObjectFactory.newInstance(BrandName.class, brandName));
        homebrand.setRecommendStatus(ValueObjectFactory.newInstance(RecommendStatus.class, recommendStatus));
    }
}
