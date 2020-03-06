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
public class CommentId extends AbstractId
{
    @Column(name = "id")
@Column(name ="   commentId")
private String   commentId;
}
