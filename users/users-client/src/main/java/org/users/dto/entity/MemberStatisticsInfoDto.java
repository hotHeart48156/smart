package org.users.dto.entity;

import lombok.Data;
import org.users.domain.entity.MemberStatisticsInfo;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.count.*;
import org.users.domain.valueobject.id.Id;
import org.users.domain.valueobject.id.UserId;

@Data
public class MemberStatisticsInfoDto {
    private String id;
    private String userId;
    private String consumeCount;
    private String orderCount;
    private String couponCount;
    private String commentCount;
    private String returnOrderCount;
    private String LoginCount;
    private String AttentionCount;
    private String FansCount;
    private String CollectSubjectCount;
    private String CollectProductCount;
    private String CollectTopicCount;
    private String CollectCommentCount;
    private String InviteFriendCount;

    public void accept(MemberStatisticsInfo memberstatisticsinfo) {
        memberstatisticsinfo.setId(ValueObjectFactory.newInstance(Id.class, id));
        memberstatisticsinfo.setUserId(ValueObjectFactory.newInstance(UserId.class, userId));
        memberstatisticsinfo.setConsumeCount(ValueObjectFactory.newInstance(ConsumeCount.class, consumeCount));
        memberstatisticsinfo.setOrderCount(ValueObjectFactory.newInstance(OrderCount.class, orderCount));
        memberstatisticsinfo.setCouponCount(ValueObjectFactory.newInstance(CouponCount.class, couponCount));
        memberstatisticsinfo.setCommentCount(ValueObjectFactory.newInstance(CommentCount.class, commentCount));
        memberstatisticsinfo.setReturnOrderCount(ValueObjectFactory.newInstance(ReturnOrderCount.class, returnOrderCount));
       memberstatisticsinfo.setLoginCount(ValueObjectFactory.newInstance(org.users.domain.valueobject.count.LoginCount.class,LoginCount));
    }
}
