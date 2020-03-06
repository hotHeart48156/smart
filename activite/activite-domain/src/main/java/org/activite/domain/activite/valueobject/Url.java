package org.activite.domain.activite.valueobject;

import javax.persistence.Column;
import lombok.Value;
import lombok.AllArgsConstructor;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class Url implements  ValueObject
{
@Column(name ="   url")
private  String    url;
}
