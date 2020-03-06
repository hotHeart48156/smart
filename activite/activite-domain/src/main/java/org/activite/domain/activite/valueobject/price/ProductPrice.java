package org.activite.domain.activite.valueobject.price;

import javax.persistence.Column;
import lombok.Value;
import lombok.AllArgsConstructor;
import org.activite.domain.activite.valueobject.time.AbstractPrice;

import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class ProductPrice extends AbstractPrice
{
@Column(name="   productPrice")
private  Long   productPrice;
}
