package org.activite.dto.entity;

@Data
public class GroupMemberDto {
    private String groupId;
    private String userId;
    private String createTime;
    private String expireTime;
    private String productId;

    public void accept(GroupMember groupmember) {
        groupmember.setGroupId(ValueObjectFactory.newInstance(GroupId.class, groupId));
        groupmember.setUserId(ValueObjectFactory.newInstance(UserId.class, userId));
        groupmember.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
        groupmember.setExpireTime(ValueObjectFactory.newInstance(ExpireTime.class, expireTime));
        groupmember.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
    }
}
