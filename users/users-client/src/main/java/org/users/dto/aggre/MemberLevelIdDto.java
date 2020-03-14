package org.users.domain.dto.agg;

@Data
public class MemberLevelIdDto {
    private String UserId;
    private String memberLevelId;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setMemberLevelId(ValueObjectFactory.newInstance(MemberLevelId.class, this.memberLevelId));
    }
}
