package org.activite.domain.valueobject.count;

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
public class GroupPeopleCount extends AbstractCount
{
@Column(name ="   groupPeopleCount")
private  Long   groupPeopleCount;
}
