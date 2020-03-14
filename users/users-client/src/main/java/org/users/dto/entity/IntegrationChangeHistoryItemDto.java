package org.users.dto.entity;

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
        integrationchangehistoryitem.setUserId(ValueObjectFactory.newInstance(UserId.class, memberId));
        integrationchangehistoryitem.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
        integrationchangehistoryitem.setChangeType(ValueObjectFactory.newInstance(ChangeType.class, changeType));
        integrationchangehistoryitem.setChangeCount(ValueObjectFactory.newInstance(ChangeCount.class, changeCount));
        integrationchangehistoryitem.setOperateNote(ValueObjectFactory.newInstance(OperateNote.class, operateNote));
        integrationchangehistoryitem.setOperateMan(ValueObjectFactory.newInstance(OperateMan.class, operateMan));
        integrationchangehistoryitem.setSourceType(ValueObjectFactory.newInstance(SourceType.class, sourceType));
    }
}
