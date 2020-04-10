package org.product.domain.valueobject.type;

import lombok.AllArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author "yangbiao"
 */
@Embeddable
@AllArgsConstructor
public enum CommentType implements AbstractType {
    SHOOPINT(0), MANAGE(1);

    @Column(name = "   commentType")
    private int commentType;
}
