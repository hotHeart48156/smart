package org.activite.domain.entity;

import org.activite.domain.valueobject.id.ProductId;
import org.activite.domain.valueobject.name.ProductName;
import org.activite.domain.valueobject.status.RecommendStatus;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class HomeNewProduct {
    @EmbeddedId
private ProductId productId;
    @Embedded
private ProductName productName;
    @Embedded
private RecommendStatus recommendStatus;

}
