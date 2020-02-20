package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.ProductAttributeInputeList;
import org.product.domain.valueobject.id.ProductAttributeCategoryId;
import org.product.domain.valueobject.id.ProductAttributeId;
import org.product.domain.valueobject.name.ProductAttributeName;
import org.product.domain.valueobject.status.HandAddStatus;
import org.product.domain.valueobject.status.RelatesStatus;
import org.product.domain.valueobject.type.AttributeType;
import org.product.domain.valueobject.type.FilterType;
import org.product.domain.valueobject.type.ProductAttributeInputType;
import org.product.domain.valueobject.type.ProductAttributeSelectType;

/**
 * @author "yangbiao"
 */
@Data
public class ProductAttribute {
    private ProductAttributeId productAttributeId;
    private ProductAttributeCategoryId productAttributeCategoryId;
    private ProductAttributeName productAttributeName;
    private ProductAttributeSelectType productAttributeSelectType;
    private ProductAttributeInputType productAttributeInputType;
    private ProductAttributeInputeList productAttributeInputeList;
    private FilterType filterType;
    private RelatesStatus relatesStatus;
    private HandAddStatus handAddStatus;
    private AttributeType attributeType;


}
