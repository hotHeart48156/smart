package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.MemberPrice;
import org.product.domain.valueobject.MemberlLevel;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.MemberPriceId;
import org.product.domain.valueobject.id.ProductId;

@Data
public class MemberPriceDto {
    private String memberPriceId;
    private String productId;
    private String memberlLevel;
    private String memberPrice;

    public void accept(MemberPrice memberprice) {
        memberprice.setMemberPriceId(ValueObjectFactory.newInstance(MemberPriceId.class, memberPriceId));
        memberprice.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        memberprice.setMemberlLevel(ValueObjectFactory.newInstance(MemberlLevel.class, memberlLevel));
        memberprice.setMemberPrice(ValueObjectFactory.newInstance(MemberPrice.class, memberPrice));
    }
}
