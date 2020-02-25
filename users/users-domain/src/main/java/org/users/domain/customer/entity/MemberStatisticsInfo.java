package org.users.domain.customer.entity;

import lombok.Data;
import org.users.domain.customer.valueobject.CommentGrowthPoint;
import org.users.domain.customer.valueobject.count.*;
import org.users.domain.customer.valueobject.id.Id;
import org.users.domain.customer.valueobject.id.UserId;

/**
 * @author "yangbiao"
 */
@Data
public class MemberStatisticsInfo implements Entity {
    private Id id;
    private UserId userId;
    private ConsumeCount consumeCount;
    private OrderCount orderCount;
    private CouponCount couponCount;
    private CommentCount commentCount;
    private ReturnOrderCount returnOrderCount;
    private LoginCount loginCount;
    private AttentionCount attentionCount;
    private FansCount fansCount;
    private CollectSubjectCount collectSubjectCount;
    private CollectProductCount collectProductCount;
    private CollectTopicCount collectTopicCount;
    private CollectCommentCount collectCommentCount;
    private InviteFriendCount inviteFriendCount;
}
