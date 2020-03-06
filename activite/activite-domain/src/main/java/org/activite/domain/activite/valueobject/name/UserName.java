package org.activite.domain.activite.valueobject.name;

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
public class UserName extends AbstractName
{
@Column(name ="   userName")
private  Long   userName;
}
