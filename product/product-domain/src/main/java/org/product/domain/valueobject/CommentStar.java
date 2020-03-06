package org.product.domain.valueobject;

import lombok.Value;

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
public class CommentStar implements ValueObject
{
@Column(name ="commentStar")
private String   commentStar;
}
