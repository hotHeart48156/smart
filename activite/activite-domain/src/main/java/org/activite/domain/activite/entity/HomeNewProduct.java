package org.activite.domain.activite.entity;

import org.activite.domain.activite.valueobject.id.ProductId;
import org.activite.domain.activite.valueobject.name.ProductName;
import org.activite.domain.activite.valueobject.status.RecommendStatus;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class HomeNewProduct {
    @EmbeddedId
private  ProductId productId;
    @Embedded
private  ProductName productName;
    @Embedded
private  RecommendStatus recommendStatus;

}
