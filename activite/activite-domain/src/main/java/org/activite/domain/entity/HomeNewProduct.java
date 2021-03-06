package org.activite.domain.entity;

import lombok.Data;
import org.activite.domain.valueobject.id.ProductId;
import org.activite.domain.valueobject.name.ProductName;
import org.activite.domain.valueobject.status.RecommendStatus;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@javax.persistence.Entity
@Data
@Table(name  ="smart.home_new_product")

public class HomeNewProduct extends Entity {
    @EmbeddedId
private ProductId productId;
    @Embedded
private ProductName productName;
    @Embedded
private RecommendStatus recommendStatus;

}
