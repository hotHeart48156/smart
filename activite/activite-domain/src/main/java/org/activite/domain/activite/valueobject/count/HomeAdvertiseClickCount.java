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
public class HomeAdvertiseClickCount extends AbstractCount
{
@Column(name ="   homeAdvertiseClickCount")
private  Long   homeAdvertiseClickCount;
}
