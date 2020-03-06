package org.activite.domain.activite.valueobject.id;

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
public class Id extends AbstractId
{

@Column(name ="   id")
private  Long   id;
}
