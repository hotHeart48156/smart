package org.activite.domain.valueobject.id;

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
public class UserId extends AbstractId
{
@Column(name ="   userId")
private  Long   userId;
}
