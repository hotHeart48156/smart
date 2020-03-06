package org.users.domain.customer.entity;

import lombok.Data;
import org.users.domain.customer.valueobject.CreateTime;
import org.users.domain.customer.valueobject.OperateMan;
import org.users.domain.customer.valueobject.OperateNote;
import org.users.domain.customer.valueobject.count.ChangeCount;
import org.users.domain.customer.valueobject.id.Id;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.domain.customer.valueobject.type.ChangeType;
import org.users.domain.customer.valueobject.type.SourceType;

import javax.persistence.Embedded;

/**
 * @author "yangbiao"
 */
@Data
public class IntegrationChangeHistoryItem implements Entity {
    @Embedded
private  Id id;
    @Embedded
private  UserId memberId;
    @Embedded
private  CreateTime createTime;
    @Embedded
private  ChangeType changeType;
    @Embedded
private  ChangeCount changeCount;
    @Embedded
private  OperateNote operateNote;
    @Embedded
private  OperateMan operateMan;
    @Embedded
private  SourceType sourceType;
}
