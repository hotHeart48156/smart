package org.users.dto.entity;

@Data
public class MemberStatisticsInfoDto {
    private String id;
    private String userId;
    private String consumeCount;
    private String orderCount;
    private String couponCount;
    private String commentCount;
    private String returnOrderCount;
    private String LoginCount
    private String AttentionCount
    private String FansCount
    private String CollectSubjectCount
    private String CollectProductCount
    private String CollectTopicCount
    private String CollectCommentCount
    private String InviteFriendCount

    public void accept(MemberStatisticsInfo memberstatisticsinfo) {
        memberstatisticsinfo.setId(ValueObjectFactory.newInstance(Id.class, id));
        memberstatisticsinfo.setUserId(ValueObjectFactory.newInstance(UserId.class, userId));
        memberstatisticsinfo.setConsumeCount(ValueObjectFactory.newInstance(ConsumeCount.class, consumeCount));
        memberstatisticsinfo.setOrderCount(ValueObjectFactory.newInstance(OrderCount.class, orderCount));
        memberstatisticsinfo.setCouponCount(ValueObjectFactory.newInstance(CouponCount.class, couponCount));
        memberstatisticsinfo.setCommentCount(ValueObjectFactory.newInstance(CommentCount.class, commentCount));
        memberstatisticsinfo.setReturnOrderCount(ValueObjectFactory.newInstance(ReturnOrderCount.class, returnOrderCount));
        memberstatisticsinfo.set(ValueObjectFactory.newInstance(. class ,LoginCoun));
        memberstatisticsinfo.set(ValueObjectFactory.newInstance(. class ,AttentionCoun));
        memberstatisticsinfo.set(ValueObjectFactory.newInstance(. class ,FansCoun));
        memberstatisticsinfo.set(ValueObjectFactory.newInstance(. class ,CollectSubjectCoun));
        memberstatisticsinfo.set(ValueObjectFactory.newInstance(. class ,CollectProductCoun));
        memberstatisticsinfo.set(ValueObjectFactory.newInstance(. class ,CollectTopicCoun));
        memberstatisticsinfo.set(ValueObjectFactory.newInstance(. class ,CollectCommentCoun));
        memberstatisticsinfo.set(ValueObjectFactory.newInstance(. class ,InviteFriendCoun));
    }
}
