package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.*;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductAttributeId;
import org.product.domain.valueobject.id.ProductId;
import org.product.domain.valueobject.name.MemberName;
import org.product.domain.valueobject.name.ProductName;
import org.product.domain.valueobject.time.CreateTime;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.List;

/**
 * @author "yangbiao"
 */
@Data
@Entity
public class Comment   implements org.product.domain.entity.Entity {

     @EmbeddedId
    private Id id;
     @Embedded
    private ProductId productId;
     @Embedded
    private MemberName memberName;
     @Embedded
    private ProductName productName;
     @Embedded
    private CommentStar commentStar;
     @Embedded
    private MemberIp memberIp;
     @Embedded
    private CreateTime createTime;
     @Embedded
    private ProductAttributeId  productAttribute;
     @Embedded
    private CollectCount collectCount;
     @Embedded
    private List<Pic> pics;
     @Embedded
    private MemberIcon memberIcon;
     @Embedded
    private ReplyCount replyCount;

}
