package org.product.domain.entity;

import org.product.domain.valueobject.MemberlLevel;
import org.product.domain.valueobject.id.MemberPriceId;
import org.product.domain.valueobject.id.ProductId;

/**
 * @author "yangbiao"
 */
public class MemberPrice {
    private MemberPriceId memberPriceId;
    private ProductId productId;
    private MemberlLevel memberlLevel;
    private org.product.domain.valueobject.MemberPrice memberPrice;

}
