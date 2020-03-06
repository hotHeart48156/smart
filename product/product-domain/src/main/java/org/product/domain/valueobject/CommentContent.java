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
public class CommentContent implements ValueObject
{
@Column(name ="   commentContent")
private String   commentContent;
}
