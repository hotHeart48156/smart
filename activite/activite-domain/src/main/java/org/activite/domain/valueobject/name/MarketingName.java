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
public class MarketingName extends AbstractName
{
@Column(name ="   marketingName")
private  Long   marketingName;
}
