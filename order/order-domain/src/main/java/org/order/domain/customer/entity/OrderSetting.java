package org.order.domain.customer.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.vaueobject.id.OrderSettingId;
import org.order.domain.customer.vaueobject.time.*;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */

@Data
@Entity
public class OrderSetting implements org.order.domain.customer.entity.Entity {
    @EmbeddedId
private  OrderSettingId orderSettingId;
    @Embedded
private  FlashOrderOverTime flashOrderOverTime;
    @Embedded
private  NormalOrderOverTime normalOrderOverTime;
    @Embedded
private  ConfirmOverTime confirmOverTime;
    @Embedded
private  FinishOverTime finishOverTime;
    @Embedded
private  CommentOverTime commentOverTime;
    @Embedded
private  CreateTime createTime;


}
