package org.activite.domain.entity;

import lombok.Data;
import org.activite.domain.valueobject.id.ProductId;
import org.activite.domain.valueobject.name.ProductName;
import org.activite.domain.valueobject.status.RecommendStatus;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@Data
@Entity
@Table(name  ="smart.recommand_product")

public class RecommendProduct extends AbstractEntity{
    @EmbeddedId
private ProductId productId;
    @Embedded
private ProductName productName;
    @Embedded
private RecommendStatus recommendStatus;

}
