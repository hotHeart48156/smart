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
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 * 成长值变化历史记录表
 */
@Data
public class GrowthChangeHistoryItem implements Entity {
    @EmbeddedId
private  Id id;
    @Embedded
private  UserId memberId;
    @Embedded
private  CreateTime createTime;
    @Embedded
private  ChangeType growthChangeType;
    @Embedded
private  ChangeCount changeCount;
    @Embedded
private  OperateMan operateMan;
    @Embedded
private  OperateNote operateNote;
    @Embedded
private  SourceType sourceType;
}
