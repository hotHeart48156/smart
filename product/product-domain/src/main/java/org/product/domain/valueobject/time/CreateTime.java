package org.product.domain.valueobject.time;

import org.product.domain.valueobject.sn.AbstractSn;

import javax.persistence.Column;
import lombok.Value;
import lombok.AllArgsConstructor;
import javax.persistence.Embeddable;
import java.sql.Timestamp;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class CreateTime  extends AbstractTime
{
@Column(name ="   createTime")
private  Timestamp   createTime;
}
