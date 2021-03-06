package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.Comment;
import org.product.domain.valueobject.*;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductAttributeId;
import org.product.domain.valueobject.id.ProductId;
import org.product.domain.valueobject.name.MemberName;
import org.product.domain.valueobject.name.ProductName;
import org.product.domain.valueobject.time.CreateTime;
@Data
public class CommentDto   extends AbstractEntityDto{
    private String id;
    private String productId;
    private String memberName;
    private String productName;
    private String commentStar;
    private String memberIp;
    private String createTime;
    private String productAttributeId;
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
        comment.setProductAttribute(ValueObjectFactory.newInstance(ProductAttributeId.class, productAttributeId));
        comment.setCollectCount(ValueObjectFactory.newInstance(CollectCount.class, collectCount));
        comment.setMemberIcon(ValueObjectFactory.newInstance(MemberIcon.class, memberIcon));
        comment.setReplyCount(ValueObjectFactory.newInstance(ReplyCount.class, replyCount));
    }
}
