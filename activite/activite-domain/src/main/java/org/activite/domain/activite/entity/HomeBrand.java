package org.activite.domain.activite.entity;

import org.activite.domain.activite.valueobject.id.BrandId;
import org.activite.domain.activite.valueobject.name.BrandName;
import org.activite.domain.activite.valueobject.status.RecommendStatus;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
public class HomeBrand {
    @EmbeddedId
private  BrandId brandId;
    @Embedded
private  BrandName brandName;
    @Embedded
private  RecommendStatus recommendStatus;

}
