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
public class ParentCategoryName extends AbstractName
{
@Column(name ="   parentCategoryName")
private  Long   parentCategoryName;
}
