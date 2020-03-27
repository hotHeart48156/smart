package org.product.domain.entity;

import lombok.Data;
import org.product.domain.valueobject.Detail;
import org.product.domain.valueobject.VerifyMan;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;
import org.product.domain.valueobject.time.CreateTime;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author "yangbiao"
 */
@Data
@Entity
public class ProductVerifyRecord   implements org.product.domain.entity.Entity {
    

       @EmbeddedId
    private Id id;
       @Embedded
    private ProductId productId;
       @Embedded
    private CreateTime createTime;
       @Embedded
    private VerifyMan verifyMan;
       @Embedded
    private Detail detail;
}
