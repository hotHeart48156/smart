package org.product.dto.aggre;

import lombok.Data;
import org.product.domain.aggragate.Brand;
import org.product.domain.valueobject.BrandStory;
import org.product.domain.valueobject.ValueObjectFactory;

import org.product.domain.aggragate.Product;
@Data
public class BrandStoryDto {
    private String ProductId;
    private String brandStory;

    public void accept(Brand brand) {
        brand.setBrandId(ValueObjectFactory.newInstance(org.product.domain.valueobject.id.BrandId.class, this.ProductId));
        brand.setBrandStory(ValueObjectFactory.newInstance(BrandStory.class, this.brandStory));
    }
}
