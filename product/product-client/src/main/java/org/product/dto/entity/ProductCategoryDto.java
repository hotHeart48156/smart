package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.ProductCategory;
import org.product.domain.valueobject.ProductCategoryIcon;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.ProductCategoryId;
import org.product.domain.valueobject.id.ProductCategoryParentId;
import org.product.domain.valueobject.name.ProductCategoryName;
import org.product.domain.valueobject.status.IndexStatus;
import org.product.domain.valueobject.status.NavStatus;
import org.product.domain.valueobject.status.ShowStatus;
@Data
public class ProductCategoryDto   extends AbstractEntityDto{
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
