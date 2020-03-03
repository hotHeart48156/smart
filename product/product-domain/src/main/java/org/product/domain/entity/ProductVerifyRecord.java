package org.product.domain.entity;

import org.product.domain.valueobject.Detail;
import org.product.domain.valueobject.VerifyMan;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;
import org.product.domain.valueobject.time.CreateTime;

/**
 * @author "yangbiao"
 */
public class ProductVerifyRecord {
    private Id id;
    private ProductId productId;
    private CreateTime createTime;
    private VerifyMan verifyMan;
    private Detail detail;
}
