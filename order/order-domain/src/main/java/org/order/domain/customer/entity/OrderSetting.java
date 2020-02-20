package org.order.domain.customer.entity;

import com.geekhalo.ddd.lite.domain.DomainEvent;
import com.geekhalo.ddd.lite.domain.ValidationHandler;
import com.geekhalo.ddd.lite.domain.support.jpa.JpaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.vaueobject.id.OrderSettingId;
import org.order.domain.customer.vaueobject.time.*;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @author "yangbiao"
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class OrderSetting extends JpaEntity {
    private OrderSettingId orderSettingId;
    private FlashOrderOverTime flashOrderOverTime;
    private NormalOrderOverTime normalOrderOverTime;
    private ConfirmOverTime confirmOverTime;
    private FinishOverTime finishOverTime;
    private CommentOverTime commentOverTime;
    private CreateTime createTime;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }
}
