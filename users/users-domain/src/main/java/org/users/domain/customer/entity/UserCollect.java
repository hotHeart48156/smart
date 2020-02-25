package org.users.domain.customer.entity;

/**
 * @author "yangbiao"
 */

import lombok.Data;
import org.users.domain.customer.entity.Entity;
import org.users.domain.customer.valueobject.CreateTime;
import org.users.domain.customer.valueobject.GoodsPic;
import org.users.domain.customer.valueobject.GoodsPrice;
import org.users.domain.customer.valueobject.id.GoodsId;
import org.users.domain.customer.valueobject.id.Id;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.domain.customer.valueobject.name.GoodsName;
import org.users.domain.customer.valueobject.type.CollectType;

/**
 * @author "yangbiao"
 * 用户收藏商品或文章。
 */
@Data
public class UserCollect implements Entity {
    private Id id;
    private UserId memberId;
    private GoodsId goodsId;
    private GoodsName goodsName;
    private GoodsPrice goodsPrice;
    private GoodsPic goodsPic;
    private CollectType collectType;
    private CreateTime createTime;
}