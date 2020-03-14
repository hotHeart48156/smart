package org.product.dtoo.dto;

@Data
public class ProductAttributeCategoryDto {
    private String id;
    private String productAttributeCategoryId;

    public void accept(ProductAttributeCategory productattributecategory) {
        productattributecategory.setId(ValueObjectFactory.newInstance(Id.class, id));
        productattributecategory.setProductAttributeCategoryId(ValueObjectFactory.newInstance(ProductAttributeCategoryId.class, productAttributeCategoryId));
    }
}
