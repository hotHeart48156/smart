package org.users.domain.entity;

import lombok.Data;
import org.users.domain.valueobject.id.Id;
import org.users.domain.valueobject.id.UserId;
import org.users.domain.valueobject.count.*;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 */
@Data
public class MemberStatisticsInfo implements Entity {
    @EmbeddedId
private Id id;
    @Embedded
private UserId userId;
    @Embedded
private ConsumeCount consumeCount;
    @Embedded
private OrderCount orderCount;
    @Embedded
private CouponCount couponCount;
    @Embedded
private CommentCount commentCount;
    @Embedded
private ReturnOrderCount returnOrderCount;
    @Embedded
private  LoginCount loginCount;
    @Embedded
private  AttentionCount attentionCount;
    @Embedded
private  FansCount fansCount;
    @Embedded
private  CollectSubjectCount collectSubjectCount;
    @Embedded
private  CollectProductCount collectProductCount;
    @Embedded
private  CollectTopicCount collectTopicCount;
    @Embedded
private  CollectCommentCount collectCommentCount;
    @Embedded
private  InviteFriendCount inviteFriendCount;
}
