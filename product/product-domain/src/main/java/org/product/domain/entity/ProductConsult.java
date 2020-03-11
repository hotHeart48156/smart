package org.product.domain.entity;

import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.UserId;
import org.product.domain.valueobject.id.ProductId;
import org.product.domain.valueobject.name.MemberName;
import org.product.domain.valueobject.name.ProductName;

/**
 * @author "yangbiao"
 */
public class ProductConsult {
    private Id id;
    private ProductId productId;
    private ProductName productName;
    private UserId memberId;
    private MemberName memberName;

}
