package org.activite.domain.valueobject;

import lombok.AllArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */

@Embeddable
@AllArgsConstructor
public enum Platform implements  ValueObject
{
    PC(1),APP(2);
@Column(name ="   platform")
private  int   platform;
}
