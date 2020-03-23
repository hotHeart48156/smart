package org.product.dto.aggre.brand;

import lombok.Data;
import org.product.domain.aggragate.Brand;
import org.product.domain.valueobject.BrandStory;
import org.product.domain.valueobject.ValueObjectFactoty;

@Data
public class BrandStoryDto extends AbstractBrandDto {
    private String brandStory;


    @Override
    public void execute(Brand brand) {
        brand.setBrandStory(ValueObjectFactoty.newInstance(BrandStory.class,brandStory));
    }
}
