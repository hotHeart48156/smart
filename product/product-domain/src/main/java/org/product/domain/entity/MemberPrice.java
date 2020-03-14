package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.MemberlLevel;
import org.product.domain.valueobject.id.MemberPriceId;
import org.product.domain.valueobject.id.ProductId;

/**
 * @author "yangbiao"
 */
@Data
public class MemberPrice {
    private MemberPriceId memberPriceId;
    private ProductId productId;
    private MemberlLevel memberlLevel;
    private MemberPrice memberPrice;

}
