package org.product.domain.aggragate;

import lombok.Data;
import org.product.domain.valueobject.*;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.name.BrandName;
import org.product.domain.valueobject.name.Name;
import org.product.domain.valueobject.status.FactoryStatus;
import org.product.domain.valueobject.status.ShowStatus;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@Entity
@Data
@Table(name = "brand")
public class Brand {
    @EmbeddedId
    private Id brandId;
    @Embedded
    private BrandName brandName;
    @Embedded
    private Letter firstLetter;
    @Embedded
    private FactoryStatus factoryStatus;
    @Embedded
    private ShowStatus showStatus;
    @Embedded
    private ProductCount productCount;
    @Embedded
    private ProductComment productComment;
    @Embedded
    private ProductLogo productLogo;
    @Embedded
    private ProductPic productPic;
    @Embedded
    private BrandStory brandStory;


}
