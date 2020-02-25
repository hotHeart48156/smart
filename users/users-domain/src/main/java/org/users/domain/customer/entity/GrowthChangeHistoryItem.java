package org.users.domain.customer.entity;

import org.users.domain.customer.valueobject.CreateTime;
import org.users.domain.customer.valueobject.OperateMan;
import org.users.domain.customer.valueobject.OperateNote;
import org.users.domain.customer.valueobject.count.ChangeCount;
import org.users.domain.customer.valueobject.id.Id;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.domain.customer.valueobject.type.ChangeType;
import org.users.domain.customer.valueobject.type.SourceType;

/**
 * @author "yangbiao"
 * 成长值变化历史记录表
 */
public class GrowthChangeHistoryItem implements Entity {
    private Id id;
    private UserId memberId;
    private CreateTime createTime;
    private ChangeType growthChangeType;
    private ChangeCount changeCount;
    private OperateMan operateMan;
    private OperateNote operateNote;
    private SourceType sourceType;
}
