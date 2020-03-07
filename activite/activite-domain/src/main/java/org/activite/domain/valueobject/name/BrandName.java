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
public class BrandName extends AbstractName
{
@Column(name ="   brandName")
private  Long   brandName;
}
