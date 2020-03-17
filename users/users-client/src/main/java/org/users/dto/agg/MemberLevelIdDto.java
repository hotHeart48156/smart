package org.users.dto.agg;

import lombok.Data;
import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.id.MemberLevelId;

@Data
public class MemberLevelIdDto {
    private String UserId;
    private String memberLevelId;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(org.users.domain.valueobject.id.UserId.class, this.UserId));
        user.setMemberLevelId(ValueObjectFactory.newInstance(MemberLevelId.class, this.memberLevelId));
    }
}
