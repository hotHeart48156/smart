package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.CommentReply;
import org.product.domain.valueobject.CommentContent;
import org.product.domain.valueobject.MemberIcon;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.CommentId;
import org.product.domain.valueobject.id.CommentReplalyId;
import org.product.domain.valueobject.name.MemberName;
import org.product.domain.valueobject.time.CreateTime;
import org.product.domain.valueobject.type.CommentType;

@Data
public class CommentReplyDto {
    private String commentReplalyId;
    private String commentId;
    private String memberName;
    private String memberIcon;
    private String commentContent;
    private String createTime;
    private String commentType;

    public void accept(CommentReply commentreply) {
        commentreply.setCommentReplalyId(ValueObjectFactory.newInstance(CommentReplalyId.class, commentReplalyId));
        commentreply.setCommentId(ValueObjectFactory.newInstance(CommentId.class, commentId));
        commentreply.setMemberName(ValueObjectFactory.newInstance(MemberName.class, memberName));
        commentreply.setMemberIcon(ValueObjectFactory.newInstance(MemberIcon.class, memberIcon));
        commentreply.setCommentContent(ValueObjectFactory.newInstance(CommentContent.class, commentContent));
        commentreply.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
        commentreply.setCommentType(ValueObjectFactory.newInstance(CommentType.class, commentType));
    }
}
