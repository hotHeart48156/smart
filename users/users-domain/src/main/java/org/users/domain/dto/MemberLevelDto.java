package org.users.domain.dto.entity;

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
        memberlevel.setMemberLevelId(ValueObjectFactory.newInstance(MemberLevelId.class, id));
        memberlevel.setMemberLevelName(ValueObjectFactory.newInstance(MemberLevelName.class, memberLevelName));
        memberlevel.setGrowth(ValueObjectFactory.newInstance(Growth.class, growth));
        memberlevel.setDefaultStatus(ValueObjectFactory.newInstance(DefaultStatus.class, defaultStatus));
        memberlevel.setCommentGrowthPoint(ValueObjectFactory.newInstance(CommentGrowthPoint.class, commentGrowthPoint));
        memberlevel.setIsPrivilegedFreeFreight(ValueObjectFactory.newInstance(IsPrivilegedFreeFreight.class, isPrivilegedFreeFreight));
        memberlevel.setIsPrivilegedComment(ValueObjectFactory.newInstance(IsPrivilegedComment.class, isPrivilegedComment));
        memberlevel.setIsPrivilegedPromotion(ValueObjectFactory.newInstance(IsPrivilegedPromotion.class, isPrivilegePromotion));
        memberlevel.setIsPrivilegedMemberPrice(ValueObjectFactory.newInstance(IsPrivilegedMemberPrice.class, isPrivilegeMemberPrice));
        memberlevel.setIsPrivilegedBirthdays(ValueObjectFactory.newInstance(IsPrivilegedBirthdays.class, isPrivilegeBirthday));
        memberlevel.setPrice(ValueObjectFactory.newInstance(Price.class, toMemberPrice));
        memberlevel.setNote(ValueObjectFactory.newInstance(Note.class, note));
    }
}
