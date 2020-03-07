package org.activite.domain.valueobject.time;

import lombok.Value;
import lombok.AllArgsConstructor;
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
public class CouponEnableTime extends AbstractTime
{

@Column(name ="   couponEnableTime")
private  Timestamp   couponEnableTime;
}
