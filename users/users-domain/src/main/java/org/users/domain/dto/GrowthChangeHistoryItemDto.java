package org.users.domain.dto.entity;

import lombok.Data;
import org.users.domain.entity.GrowthChangeHistoryItem;
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
public class GrowthChangeHistoryItemDto {
    private String id;
    private String memberId;
    private String createTime;
    private String growthChangeType;
    private String changeCount;
    private String operateMan;
    private String operateNote;
    private String sourceType;

    public void accept(GrowthChangeHistoryItem growthchangehistoryitem) {
        growthchangehistoryitem.setId(ValueObjectFactory.newInstance(Id.class, id));
        growthchangehistoryitem.setMemberId(ValueObjectFactory.newInstance(UserId.class, memberId));
        growthchangehistoryitem.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
        growthchangehistoryitem.setGrowthChangeType(ValueObjectFactory.newInstance(ChangeType.class, growthChangeType));
        growthchangehistoryitem.setChangeCount(ValueObjectFactory.newInstance(ChangeCount.class, changeCount));
        growthchangehistoryitem.setOperateMan(ValueObjectFactory.newInstance(OperateMan.class, operateMan));
        growthchangehistoryitem.setOperateNote(ValueObjectFactory.newInstance(OperateNote.class, operateNote));
        growthchangehistoryitem.setSourceType(ValueObjectFactory.newInstance(SourceType.class, sourceType));
    }
}
