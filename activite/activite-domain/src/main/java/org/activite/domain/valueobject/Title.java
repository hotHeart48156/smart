package org.activite.domain.valueobject;

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
public class Title implements  ValueObject
{
@Column(name ="   title")
private  String    title;
}
