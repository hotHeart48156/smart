package org.users.domain.customer.entity;

import org.users.domain.customer.valueobject.CreateTime;
import org.users.domain.customer.valueobject.OperateMan;
import org.users.domain.customer.valueobject.OperateNote;
import org.users.domain.customer.valueobject.count.ChangeCount;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.domain.customer.valueobject.type.ChangeType;
import org.users.domain.customer.valueobject.type.SourceType;

/**
 * @author "yangbiao"
 */
public class IntegrationChangeHistory {
    private UserId memberId;
    private CreateTime createTime;
    private ChangeType changeType;
    private ChangeCount changeCount;
    private OperateNote operateNote;
    private OperateMan operateMan;
    private SourceType sourceType;
}
