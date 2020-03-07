package org.users.domain.entity;

/**
 * @author "yangbiao"
 */

import lombok.Data;
import org.users.domain.valueobject.CreateTime;
import org.users.domain.valueobject.GoodsPic;
import org.users.domain.valueobject.GoodsPrice;
import org.users.domain.valueobject.id.GoodsId;
import org.users.domain.valueobject.id.Id;
import org.users.domain.valueobject.id.UserId;
import org.users.domain.valueobject.name.GoodsName;
import org.users.domain.valueobject.type.CollectType;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

/**
 * @author "yangbiao"
 * 用户收藏商品或文章。
 */
@Data
public class UserCollect implements Entity {
    @EmbeddedId
private Id id;
    @Embedded
private UserId memberId;
    @Embedded
private GoodsId goodsId;
    @Embedded
private GoodsName goodsName;
    @Embedded
private GoodsPrice goodsPrice;
    @Embedded
private GoodsPic goodsPic;
    @Embedded
private CollectType collectType;
    @Embedded
private CreateTime createTime;
}