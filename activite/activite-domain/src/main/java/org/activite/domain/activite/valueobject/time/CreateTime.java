package org.activite.domain.activite.valueobject.time;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.domain.activite.valueobject.price.AbstractTime;

import javax.persistence.Embeddable;
import java.sql.Timestamp;
import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class CreateTime extends AbstractTime
{

@Column(name ="   createTime")
private  Timestamp   createTime;
}
