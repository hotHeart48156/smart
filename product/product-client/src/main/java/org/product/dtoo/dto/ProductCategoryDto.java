package org.product.dtoo.dto;

@Data
public class ProductCategoryDto {
    private String productCategoryId;
    private String productCategoryParentId;
    private String productCategoryName;
    private String navStatus;
    private String showStatus;
    private String indexStatus;
    private String productCategoryIcon;

    public void accept(ProductCategory productcategory) {
        productcategory.setProductCategoryId(ValueObjectFactory.newInstance(ProductCategoryId.class, productCategoryId));
        productcategory.setProductCategoryParentId(ValueObjectFactory.newInstance(ProductCategoryParentId.class, productCategoryParentId));
        productcategory.setProductCategoryName(ValueObjectFactory.newInstance(ProductCategoryName.class, productCategoryName));
        productcategory.setNavStatus(ValueObjectFactory.newInstance(NavStatus.class, navStatus));
        productcategory.setShowStatus(ValueObjectFactory.newInstance(ShowStatus.class, showStatus));
        productcategory.setIndexStatus(ValueObjectFactory.newInstance(IndexStatus.class, indexStatus));
        productcategory.setProductCategoryIcon(ValueObjectFactory.newInstance(ProductCategoryIcon.class, productCategoryIcon));
    }
}
