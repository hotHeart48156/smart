package org.activite.domain.entity;

import org.activite.domain.valueobject.id.BrandId;
import org.activite.domain.valueobject.name.BrandName;
import org.activite.domain.valueobject.status.RecommendStatus;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class HomeBrand {
    @EmbeddedId
private BrandId brandId;
    @Embedded
private BrandName brandName;
    @Embedded
private RecommendStatus recommendStatus;

}
