package org.product.domain.entity;

import org.product.domain.valueobject.ProductCategoryIcon;
import org.product.domain.valueobject.id.ProductCategoryId;
import org.product.domain.valueobject.id.ProductCategoryParentId;
import org.product.domain.valueobject.name.ProductCategoryName;
import org.product.domain.valueobject.status.IndexStatus;
import org.product.domain.valueobject.status.NavStatus;
import org.product.domain.valueobject.status.ShowStatus;

/**
 * @author "yangbiao"
 */
public class ProductCategory {
    private ProductCategoryId productCategoryId;
    private ProductCategoryParentId productCategoryParentId;
    private ProductCategoryName productCategoryName;
    private NavStatus navStatus;
    private ShowStatus showStatus;
    private IndexStatus indexStatus;
    private ProductCategoryIcon productCategoryIcon;

}
