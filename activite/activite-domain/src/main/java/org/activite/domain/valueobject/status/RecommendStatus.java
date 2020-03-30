package org.activite.domain.valueobject.status;

import lombok.AllArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Embeddable
@AllArgsConstructor
public enum RecommendStatus implements Status
{
    RECOMMEND(1),UNRECOMMEDN(0);
@Column(name="recommendStatus")
private  int   recommendStatus;


}
