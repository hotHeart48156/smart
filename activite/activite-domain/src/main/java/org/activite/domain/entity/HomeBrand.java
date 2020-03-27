package org.activite.domain.entity;

import lombok.Data;
import org.activite.domain.valueobject.id.BrandId;
import org.activite.domain.valueobject.name.BrandName;
import org.activite.domain.valueobject.status.RecommendStatus;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@javax.persistence.Entity
@Data
@Table(name  ="smart.home_brand")

public class HomeBrand extends Entity {
    @EmbeddedId
private BrandId brandId;
    @Embedded
private BrandName brandName;
    @Embedded
private RecommendStatus recommendStatus;

}
