package org.order.domain.entity;

import lombok.Data;
import org.order.domain.vaueobject.id.OrderSettingId;
import org.order.domain.customer.vaueobject.time.*;
import org.order.domain.vaueobject.time.*;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */

@Data
@Entity
public class OrderSetting implements org.order.domain.entity.Entity {
    @EmbeddedId
private OrderSettingId orderSettingId;
    @Embedded
private FlashOrderOverTime flashOrderOverTime;
    @Embedded
private NormalOrderOverTime normalOrderOverTime;
    @Embedded
private ConfirmOverTime confirmOverTime;
    @Embedded
private FinishOverTime finishOverTime;
    @Embedded
private CommentOverTime commentOverTime;
    @Embedded
private  CreateTime createTime;


}
