package org.users.domain.customer.entity;

import lombok.Data;
import org.users.domain.customer.valueobject.CommentGrowthPoint;
import org.users.domain.customer.valueobject.Growth;
import org.users.domain.customer.valueobject.Note;
import org.users.domain.customer.valueobject.Price;
import org.users.domain.customer.valueobject.id.Id;
import org.users.domain.customer.valueobject.id.MemberLevelId;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.domain.customer.valueobject.is.*;
import org.users.domain.customer.valueobject.name.MemberLevelName;
import org.users.domain.customer.valueobject.status.DefaultStatus;

/**
 * @author "yangbiao"
 */
@Data
public class MemberLevel implements Entity {
    private MemberLevelId id;
    private MemberLevelName memberLevelName;
    private Growth growth;
    private DefaultStatus defaultStatus;
    private CommentGrowthPoint commentGrowthPoint;
    private IsPrivilegedFreeFreight isPrivilegedFreeFreight;
    private IsPrivilegedComment isPrivilegedComment;
    private IsPrivilegedPromotion isPrivilegePromotion;
    private IsPrivilegedMemberPrice isPrivilegeMemberPrice;
    private IsPrivilegedBirthdays isPrivilegeBirthday;
    private Price toMemberPrice;
    private Note note;

}
