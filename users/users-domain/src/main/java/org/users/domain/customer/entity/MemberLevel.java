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

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
@Data
public class MemberLevel implements Entity {
    @EmbeddedId
private  MemberLevelId id;
    @Embedded
private  MemberLevelName memberLevelName;
    @Embedded
private  Growth growth;
    @Embedded
private  DefaultStatus defaultStatus;
    @Embedded
private  CommentGrowthPoint commentGrowthPoint;
    @Embedded
private  IsPrivilegedFreeFreight isPrivilegedFreeFreight;
    @Embedded
private  IsPrivilegedComment isPrivilegedComment;
    @Embedded
private  IsPrivilegedPromotion isPrivilegePromotion;
    @Embedded
private  IsPrivilegedMemberPrice isPrivilegeMemberPrice;
    @Embedded
private  IsPrivilegedBirthdays isPrivilegeBirthday;
    @Embedded
private  Price toMemberPrice;
    @Embedded
private  Note note;

}
