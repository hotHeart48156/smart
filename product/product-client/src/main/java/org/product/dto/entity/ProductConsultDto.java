package org.product.dto.entity;

import lombok.Data;
import org.product.domain.entity.ProductConsult;
import org.product.domain.valueobject.ValueObjectFactory;
import org.product.domain.valueobject.id.Id;
import org.product.domain.valueobject.id.ProductId;
import org.product.domain.valueobject.id.UserId;
import org.product.domain.valueobject.name.MemberName;
import org.product.domain.valueobject.name.ProductName;
@Data
public class ProductConsultDto   extends AbstractEntityDto{
    private String id;
    private String productId;
    private String productName;
    private String memberId;
    private String memberName;

    public void accept(ProductConsult productconsult) {
        productconsult.setId(ValueObjectFactory.newInstance(Id.class, id));
        productconsult.setProductId(ValueObjectFactory.newInstance(ProductId.class, productId));
        productconsult.setProductName(ValueObjectFactory.newInstance(ProductName.class, productName));
        productconsult.setMemberId(ValueObjectFactory.newInstance(UserId.class, memberId));
        productconsult.setMemberName(ValueObjectFactory.newInstance(MemberName.class, memberName));
    }
}
