package org.product.domain.valueobject.status;

import javax.persistence.Column;

import lombok.Value;
import lombok.AllArgsConstructor;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class IndexStatus extends AbstractStatus {
    @Column(name = "   indexStatus")
    private BigDecimal indexStatus;
}
