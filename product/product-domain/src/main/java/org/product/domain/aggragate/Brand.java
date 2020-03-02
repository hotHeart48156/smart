package org.product.domain.aggragate;

import lombok.Data;
import org.product.domain.valueobject.*;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.name.MemberName;
import org.product.domain.valueobject.name.Name;
import org.product.domain.valueobject.status.FactoryStatus;
import org.product.domain.valueobject.status.ShowStatus;

import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */
@Entity
@Data
public class Brand {
    private Id brandId;
    private Name brandName;
    private Lettter firstLetter;
    private FactoryStatus factoryStatus;
    private ShowStatus showStatus;
    private ProductCount productCount;
    private ProductComment productComment;
    private ProductLogo productLogo;
    private ProductPic productPic;
    private BrandStory brandStory;


}
