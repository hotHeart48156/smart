package org.users.dto.entity;

import lombok.Data;
import org.users.domain.entity.IntegrationChangeHistoryItem;
import org.users.domain.valueobject.CreateTime;
import org.users.domain.valueobject.OperateMan;
import org.users.domain.valueobject.OperateNote;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.count.ChangeCount;
import org.users.domain.valueobject.id.Id;
import org.users.domain.valueobject.id.UserId;
import org.users.domain.valueobject.type.ChangeType;
import org.users.domain.valueobject.type.SourceType;

@Data
public class IntegrationChangeHistoryItemDto {
    private String id;
    private String memberId;
    private String createTime;
    private String changeType;
    private String changeCount;
    private String operateNote;
    private String operateMan;
    private String sourceType;

    public void accept(IntegrationChangeHistoryItem integrationchangehistoryitem) {
        integrationchangehistoryitem.setId(ValueObjectFactory.newInstance(Id.class, id));
        integrationchangehistoryitem.setMemberId(ValueObjectFactory.newInstance(UserId.class, memberId));
        integrationchangehistoryitem.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
        integrationchangehistoryitem.setChangeType(ValueObjectFactory.newInstance(ChangeType.class, changeType));
        integrationchangehistoryitem.setChangeCount(ValueObjectFactory.newInstance(ChangeCount.class, changeCount));
        integrationchangehistoryitem.setOperateNote(ValueObjectFactory.newInstance(OperateNote.class, operateNote));
        integrationchangehistoryitem.setOperateMan(ValueObjectFactory.newInstance(OperateMan.class, operateMan));
        integrationchangehistoryitem.setSourceType(ValueObjectFactory.newInstance(SourceType.class, sourceType));
    }
}
