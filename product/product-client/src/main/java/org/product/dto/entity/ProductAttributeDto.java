package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.ProductAttribute;
import org.product.domain.valueobject.ProductAttributeInputList;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.ProductAttributeCategoryId;
import org.product.domain.valueobject.id.ProductAttributeId;
import org.product.domain.valueobject.name.ProductAttributeName;
import org.product.domain.valueobject.status.HandAddStatus;
import org.product.domain.valueobject.status.RelatesStatus;
import org.product.domain.valueobject.type.AttributeType;
import org.product.domain.valueobject.type.FilterType;
import org.product.domain.valueobject.type.ProductAttributeInputType;
import org.product.domain.valueobject.type.ProductAttributeSelectType;

@Data
public class ProductAttributeDto {
    private String productAttributeId;
    private String productAttributeCategoryId;
    private String productAttributeName;
    private String productAttributeSelectType;
    private String productAttributeInputType;
    private String productAttributeInputeList;
    private String filterType;
    private String relatesStatus;
    private String handAddStatus;
    private String attributeType;

    public void accept(ProductAttribute productattribute) {
        productattribute.setProductAttributeId(ValueObjectFactory.newInstance(ProductAttributeId.class, productAttributeId));
        productattribute.setProductAttributeCategoryId(ValueObjectFactory.newInstance(ProductAttributeCategoryId.class, productAttributeCategoryId));
        productattribute.setProductAttributeName(ValueObjectFactory.newInstance(ProductAttributeName.class, productAttributeName));
        productattribute.setProductAttributeSelectType(ValueObjectFactory.newInstance(ProductAttributeSelectType.class, productAttributeSelectType));
        productattribute.setProductAttributeInputType(ValueObjectFactory.newInstance(ProductAttributeInputType.class, productAttributeInputType));
        productattribute.setProductAttributeInputeList(ValueObjectFactory.newInstance(ProductAttributeInputList.class, productAttributeInputeList));
        productattribute.setFilterType(ValueObjectFactory.newInstance(FilterType.class, filterType));
        productattribute.setRelatesStatus(ValueObjectFactory.newInstance(RelatesStatus.class, relatesStatus));
        productattribute.setHandAddStatus(ValueObjectFactory.newInstance(HandAddStatus.class, handAddStatus));
        productattribute.setAttributeType(ValueObjectFactory.newInstance(AttributeType.class, attributeType));
    }
}
