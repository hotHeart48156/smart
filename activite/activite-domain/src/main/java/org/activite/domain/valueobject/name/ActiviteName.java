package org.activite.domain.valueobject.name;

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
public class ActiviteName extends AbstractName
{
@Column(name ="   activiteName")
private  Long   activiteName;
}
