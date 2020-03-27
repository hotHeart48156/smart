package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.ProductCategoryIcon;
import org.product.domain.valueobject.id.ProductCategoryId;
import org.product.domain.valueobject.id.ProductCategoryParentId;
import org.product.domain.valueobject.name.ProductCategoryName;
import org.product.domain.valueobject.status.IndexStatus;
import org.product.domain.valueobject.status.NavStatus;
import org.product.domain.valueobject.status.ShowStatus;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */
@Entity
@Data
public class ProductCategory   implements  org.product.domain.entity.Entity{
     @EmbeddedId
    private ProductCategoryId productCategoryId;
     @Embedded
    private ProductCategoryParentId productCategoryParentId;
     @Embedded
    private ProductCategoryName productCategoryName;
     @Embedded
    private NavStatus navStatus;
     @Embedded
    private ShowStatus showStatus;
     @Embedded
    private IndexStatus indexStatus;
     @Embedded
    private ProductCategoryIcon productCategoryIcon;

}
