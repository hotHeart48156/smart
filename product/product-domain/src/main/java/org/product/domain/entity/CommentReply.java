package org.product.domain.entity;

import org.product.domain.valueobject.CommentContent;
import org.product.domain.valueobject.MemberIcon;
import org.product.domain.valueobject.id.CommentId;
import org.product.domain.valueobject.id.CommentReplalyId;
import org.product.domain.valueobject.name.MemberName;
import org.product.domain.valueobject.time.CreateTime;
import org.product.domain.valueobject.type.CommentType;

/**
 * @author "yangbiao"
 */
public class CommentReply {
    private CommentReplalyId commentReplalyId;
    private CommentId commentId;
    private MemberName memberName;
    private MemberIcon memberIcon;
    private CommentContent commentContent;
    private CreateTime createTime;
    private CommentType commentType;
}
