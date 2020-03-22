package org.users.dto.entity;

import lombok.Data;
import org.users.domain.entity.UserCollect;
import org.users.domain.valueobject.CreateTime;
import org.users.domain.valueobject.GoodsPic;
import org.users.domain.valueobject.GoodsPrice;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.id.GoodsId;
import org.users.domain.valueobject.id.UserCollectId;
import org.users.domain.valueobject.id.UserId;
import org.users.domain.valueobject.name.GoodsName;
import org.users.domain.valueobject.type.CollectType;

@Data
public class UserCollectDto {
    private String id;
    private String memberId;
    private String goodsId;
    private String goodsName;
    private String goodsPrice;
    private String goodsPic;
    private String collectType;
    private String createTime;

    public void accept(UserCollect usercollect) {
        usercollect.setId(ValueObjectFactory.newInstance(UserCollectId.class, id));
        usercollect.setMemberId(ValueObjectFactory.newInstance(UserId.class, memberId));
        usercollect.setGoodsId(ValueObjectFactory.newInstance(GoodsId.class, goodsId));
        usercollect.setGoodsName(ValueObjectFactory.newInstance(GoodsName.class, goodsName));
        usercollect.setGoodsPrice(ValueObjectFactory.newInstance(GoodsPrice.class, goodsPrice));
        usercollect.setGoodsPic(ValueObjectFactory.newInstance(GoodsPic.class, goodsPic));
        usercollect.setCollectType(ValueObjectFactory.newInstance(CollectType.class, collectType));
        usercollect.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
    }
}
