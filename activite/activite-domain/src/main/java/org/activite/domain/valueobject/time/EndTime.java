package org.activite.domain.valueobject.time;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.activite.domain.valueobject.price.AbstractTime;

import javax.persistence.Embeddable;
import java.sql.Timestamp;
import javax.persistence.Column;
/**
 * @author "yangbiao"
 */
@Value
@Embeddable
@AllArgsConstructor
public class EndTime extends AbstractTime
{

@Column(name ="   endTime")
private  Timestamp   endTime;
}