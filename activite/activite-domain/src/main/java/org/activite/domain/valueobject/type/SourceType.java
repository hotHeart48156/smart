package org.activite.domain.valueobject.type;

import lombok.AllArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Embeddable
@AllArgsConstructor
public enum SourceType implements Type
{
    PC(1),APP(2);
@Column(name ="   sourceType")
private  int   sourceType;
}
