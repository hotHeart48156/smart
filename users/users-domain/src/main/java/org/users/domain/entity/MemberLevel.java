package org.users.domain.entity;

import lombok.Data;
import org.users.domain.valueobject.CommentGrowthPoint;
import org.users.domain.valueobject.Growth;
import org.users.domain.valueobject.Note;
import org.users.domain.valueobject.Price;
import org.users.domain.valueobject.id.MemberLevelId;
import org.users.domain.valueobject.name.MemberLevelName;
import org.users.domain.valueobject.status.DefaultStatus;
import org.users.domain.valueobject.is.*;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
@Data
public class MemberLevel implements Entity {
    @EmbeddedId
private MemberLevelId id;
    @Embedded
private MemberLevelName memberLevelName;
    @Embedded
private Growth growth;
    @Embedded
private DefaultStatus defaultStatus;
    @Embedded
private CommentGrowthPoint commentGrowthPoint;
    @Embedded
private IsPrivilegedFreeFreight isPrivilegedFreeFreight;
    @Embedded
private IsPrivilegedComment isPrivilegedComment;
    @Embedded
private IsPrivilegedPromotion isPrivilegePromotion;
    @Embedded
private IsPrivilegedMemberPrice isPrivilegeMemberPrice;
    @Embedded
private IsPrivilegedBirthdays isPrivilegeBirthday;
    @Embedded
private Price toMemberPrice;
    @Embedded
private Note note;

}
