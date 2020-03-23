package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.ProductAttributeInputList;
import org.product.domain.valueobject.id.ProductAttributeCategoryId;
import org.product.domain.valueobject.id.ProductAttributeId;
import org.product.domain.valueobject.name.ProductAttributeName;
import org.product.domain.valueobject.status.HandAddStatus;
import org.product.domain.valueobject.status.RelatesStatus;
import org.product.domain.valueobject.type.AttributeType;
import org.product.domain.valueobject.type.FilterType;
import org.product.domain.valueobject.type.ProductAttributeInputType;
import org.product.domain.valueobject.type.ProductAttributeSelectType;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
@Data
public class ProductAttribute implements Entity{
     @EmbeddedId
    private ProductAttributeId productAttributeId;
     @Embedded
    private ProductAttributeCategoryId productAttributeCategoryId;
     @Embedded
    private ProductAttributeName productAttributeName;
     @Embedded
    private ProductAttributeSelectType productAttributeSelectType;
     @Embedded
    private ProductAttributeInputType productAttributeInputType;
     @Embedded
    private ProductAttributeInputList productAttributeInputeList;
     @Embedded
    private FilterType filterType;
     @Embedded
    private RelatesStatus relatesStatus;
     @Embedded
    private HandAddStatus handAddStatus;
     @Embedded
    private AttributeType attributeType;


}
