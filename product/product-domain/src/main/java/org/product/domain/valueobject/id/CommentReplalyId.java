package org.product.domain.valueobject.id;

import lombok.Value;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;

import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class CommentReplalyId extends AbstractId
{
@Column(name ="   commentReplalyId")
private String   commentReplalyId;
}
