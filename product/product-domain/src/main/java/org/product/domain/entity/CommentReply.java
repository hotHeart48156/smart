package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.CommentContent;
import org.product.domain.valueobject.MemberIcon;
import org.product.domain.valueobject.id.CommentId;
import org.product.domain.valueobject.id.CommentReplalyId;
import org.product.domain.valueobject.name.MemberName;
import org.product.domain.valueobject.time.CreateTime;
import org.product.domain.valueobject.type.CommentType;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;

/**
 * @author "yangbiao"
 */
@javax.persistence.Entity
@Data
@Table(name = "commentReply")

public class CommentReply implements org.product.domain.entity.Entity {
     @EmbeddedId
    private CommentReplalyId commentReplalyId;
     @Embedded
    private CommentId commentId;
     @Embedded
    private MemberName memberName;
     @Embedded
    private MemberIcon memberIcon;
     @Embedded
    private CommentContent commentContent;
     @Embedded
    private CreateTime createTime;
     @Embedded
    private CommentType commentType;
}
