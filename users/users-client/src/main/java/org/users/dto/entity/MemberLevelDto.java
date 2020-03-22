package org.users.dto.entity;

import lombok.Data;
import org.users.domain.entity.MemberLevel;
import org.users.domain.valueobject.CommentGrowthPoint;
import org.users.domain.valueobject.Growth;
import org.users.domain.valueobject.Note;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.id.MemberLevelId;
import org.users.domain.valueobject.is.*;
import org.users.domain.valueobject.name.MemberLevelName;
import org.users.domain.valueobject.status.DefaultStatus;

@Data
public class MemberLevelDto {
    private String id;
    private String memberLevelName;
    private String growth;
    private String defaultStatus;
    private String commentGrowthPoint;
    private String isPrivilegedFreeFreight;
    private String isPrivilegedComment;
    private String isPrivilegePromotion;
    private String isPrivilegeMemberPrice;
    private String isPrivilegeBirthday;
    private String toMemberPrice;
    private String note;

    public void accept(MemberLevel memberlevel) {
        memberlevel.setId(ValueObjectFactory.newInstance(MemberLevelId.class, id));
        memberlevel.setMemberLevelName(ValueObjectFactory.newInstance(MemberLevelName.class, memberLevelName));
        memberlevel.setGrowth(ValueObjectFactory.newInstance(Growth.class, growth));
        memberlevel.setDefaultStatus(ValueObjectFactory.newInstance(DefaultStatus.class, defaultStatus));
        memberlevel.setCommentGrowthPoint(ValueObjectFactory.newInstance(CommentGrowthPoint.class, commentGrowthPoint));
        memberlevel.setIsPrivilegedFreeFreight(ValueObjectFactory.newInstance(IsPrivilegedFreeFreight.class, isPrivilegedFreeFreight));
        memberlevel.setIsPrivilegedComment(ValueObjectFactory.newInstance(IsPrivilegedComment.class, isPrivilegedComment));
        memberlevel.setIsPrivilegePromotion(ValueObjectFactory.newInstance(IsPrivilegedPromotion.class, isPrivilegePromotion));
        memberlevel.setIsPrivilegeMemberPrice(ValueObjectFactory.newInstance(IsPrivilegedMemberPrice.class, isPrivilegeMemberPrice));
        memberlevel.setIsPrivilegeBirthday(ValueObjectFactory.newInstance(IsPrivilegedBirthdays.class, isPrivilegeBirthday));
        memberlevel.setIsPrivilegeMemberPrice(ValueObjectFactory.newInstance(IsPrivilegedMemberPrice.class, toMemberPrice));
        memberlevel.setNote(ValueObjectFactory.newInstance(Note.class, note));
    }
}
