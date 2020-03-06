package org.product.domain.valueobject.sn;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Value;
import javax.persistence.Embeddable;
import java.math.BigDecimal;

/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class Sn extends AbstractSn {
@Column(name ="   sn")
private BigDecimal sn;
}
