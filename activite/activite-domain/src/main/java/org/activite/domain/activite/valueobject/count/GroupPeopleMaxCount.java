package org.activite.domain.activite.valueobject.count;

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
public class GroupPeopleMaxCount extends AbstractCount
{
@Column(name ="   groupPeopleMaxCount")
private  Long   groupPeopleMaxCount;
}
