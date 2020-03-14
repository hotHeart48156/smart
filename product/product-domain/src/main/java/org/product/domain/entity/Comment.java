package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.*;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;
import org.product.domain.valueobject.name.MemberName;
import org.product.domain.valueobject.name.ProductName;
import org.product.domain.valueobject.time.CreateTime;

import java.util.List;

/**
 * @author "yangbiao"
 */
@Data
public class Comment {
    private Id id;
    private ProductId productId;
    private MemberName memberName;
    private ProductName productName;
    private CommentStar commentStar;
    private MemberIp memberIp;
    private CreateTime createTime;
    private ProductAttribute productAttribute;
    private CollectCount collectCount;
    private List<Pic> pics;
    private MemberIcon memberIcon;
    private ReplyCount replyCount;

}
