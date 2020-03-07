package org.activite.domain.valueobject.price;

import javax.persistence.Column;
import lombok.Value;
import lombok.AllArgsConstructor;
import org.activite.domain.valueobject.time.AbstractPrice;

import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class GroupPrice extends AbstractPrice
{
@Column(name ="   groupPrice")
private  Long   groupPrice;
}
