package org.order.domain.customer.entity;

import com.geekhalo.ddd.lite.domain.support.jpa.JpaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.order.domain.customer.vaueobject.PromoteInfo;
import org.order.domain.customer.vaueobject.time.CreateTime;

import javax.persistence.Entity;
import java.util.Date;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Promote extends JpaEntity {
    private PromoteInfo promoteInfo;
    private CreateTime createTime;

    @Override
    public Date getCreateTime() {
        return createTime.getCreateTime();
    }
}
