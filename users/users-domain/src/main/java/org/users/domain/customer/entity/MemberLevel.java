package org.users.domain.customer.entity;

import com.sun.tools.javac.util.JCDiagnostic;
import org.users.domain.customer.valueobject.CommentGrowthPoint;
import org.users.domain.customer.valueobject.Growth;
import org.users.domain.customer.valueobject.Note;
import org.users.domain.customer.valueobject.Price;
import org.users.domain.customer.valueobject.id.MemberLevelId;
import org.users.domain.customer.valueobject.is.*;
import org.users.domain.customer.valueobject.name.MemberName;
import org.users.domain.customer.valueobject.status.DefaultStatus;

/**
 * @author "yangbiao"
 */
public class MemberLevel {
    private MemberLevelId memberLevelId;
    private MemberName memberName;
    private Growth growth;
    private DefaultStatus defaultStatus;
    private CommentGrowthPoint commentGrowthPoint;
    private IsPriviledgeFreeFreight isPriviledgeFreeFreight;
    private IsPriviledgeComment isPriviledgeComment;
    private IsPriviledgePromotion isPriviledgePromotion;
    private IsPriviledgeMemberPrice isPriviledgeMemberPrice;
    private IsPriviledgeBrithday isPriviledgeBrithday;
    private Price toMemberPrice;
    private Note note;

}
