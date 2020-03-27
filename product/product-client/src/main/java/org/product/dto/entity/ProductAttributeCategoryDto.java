package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.ProductAttributeCategory;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductAttributeCategoryId;
@Data
public class ProductAttributeCategoryDto   extends AbstractEntityDto{
    private String id;
    private String productAttributeCategoryId;

    public void accept(ProductAttributeCategory productattributecategory) {
        productattributecategory.setId(ValueObjectFactory.newInstance(Id.class, id));
        productattributecategory.setProductAttributeCategoryId(ValueObjectFactory.newInstance(ProductAttributeCategoryId.class, productAttributeCategoryId));
    }
}
