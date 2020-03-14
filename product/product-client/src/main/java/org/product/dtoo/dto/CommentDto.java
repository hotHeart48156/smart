package org.product.dtoo.dto;

@Data
public class CommentDto {
    private String id;
    private String productId;
    private String memberName;
    private String productName;
    private String commentStar;
    private String memberIp;
    private String createTime;
    private String productAttribute;
    private String collectCount;
    private String pics;
    private String memberIcon;
    private String replyCount;

    public void accept(Comment comment) {
        comment.setId(ValueObjectFactory.newInstance(Id.class, id));
        comment.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        comment.setMemberName(ValueObjectFactory.newInstance(MemberName.class, memberName));
        comment.setProductName(ValueObjectFactory.newInstance(ProductName.class, productName));
        comment.setCommentStar(ValueObjectFactory.newInstance(CommentStar.class, commentStar));
        comment.setMemberIp(ValueObjectFactory.newInstance(MemberIp.class, memberIp));
        comment.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
        comment.setProductAttribute(ValueObjectFactory.newInstance(ProductAttribute.class, productAttribute));
        comment.setCollectCount(ValueObjectFactory.newInstance(CollectCount.class, collectCount));
        comment.setList<Pic> (ValueObjectFactory.newInstance(List<Pic>.class, pics));
        comment.setMemberIcon(ValueObjectFactory.newInstance(MemberIcon.class, memberIcon));
        comment.setReplyCount(ValueObjectFactory.newInstance(ReplyCount.class, replyCount));
    }
}
