package org.activite.domain.activite.valueobject.count;

import javax.persistence.Column;
import lombok.Value;
import lombok.AllArgsConstructor;
import javax.persistence.Embeddable;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class HomeAdvertiseOrderCount extends AbstractCount
{
@Column(name ="   homeAdvertiseOrderCount")
private  Long   homeAdvertiseOrderCount;
}
