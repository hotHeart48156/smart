package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.ProductVerifyRecord;
import org.product.domain.valueobject.Detail;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.VerifyMan;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;
import org.product.domain.valueobject.time.CreateTime;
@Data
public class ProductVerifyRecordDto   extends AbstractEntityDto{
    private String id;
    private String productId;
    private String createTime;
    private String verifyMan;
    private String detail;

    public void accept(ProductVerifyRecord productverifyrecord) {
        productverifyrecord.setId(ValueObjectFactory.newInstance(Id.class, id));
        productverifyrecord.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        productverifyrecord.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, createTime));
        productverifyrecord.setVerifyMan(ValueObjectFactory.newInstance(VerifyMan.class, verifyMan));
        productverifyrecord.setDetail(ValueObjectFactory.newInstance(Detail.class, detail));
    }
}
