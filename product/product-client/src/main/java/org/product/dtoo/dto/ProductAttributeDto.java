package org.product.dtoo.dto;

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
        productattribute.setProductAttributeInputList(ValueObjectFactory.newInstance(ProductAttributeInputList.class, productAttributeInputeList));
        productattribute.setFilterType(ValueObjectFactory.newInstance(FilterType.class, filterType));
        productattribute.setRelatesStatus(ValueObjectFactory.newInstance(RelatesStatus.class, relatesStatus));
        productattribute.setHandAddStatus(ValueObjectFactory.newInstance(HandAddStatus.class, handAddStatus));
        productattribute.setAttributeType(ValueObjectFactory.newInstance(AttributeType.class, attributeType));
    }
}
