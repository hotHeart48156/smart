package org.product.domain.valueobject.id;

import lombok.Value;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;

/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class FeightTemplateId extends AbstractId
{
@Column(name ="   feightTemplateId")
private String   feightTemplateId;
}
